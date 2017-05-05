package br.crm.common.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.lang3.StringUtils;

public class AddressUtils {

	private static final String encodingString = "utf-8";

	public String getAddresses(String content) throws Exception {
		// 这里调用pconline的接口
		String urlStr = "http://ip.taobao.com/service/getIpInfo.php";
		// 从http://whois.pconline.com.cn取得IP所在的省市区信息
		String returnStr = this.getResult(urlStr, content, encodingString);
		if (returnStr != null) {
			// 处理返回的省市区信息
			// System.out.println(returnStr);
			String[] temp = returnStr.split(",");
			if (temp.length < 3) {
				return "0";// 无效IP，局域网测试
			}

			String region = (temp[5].split(":"))[1].replaceAll("\"", "");
			region = decodeUnicode(region);// 省份
			String country = "";
			String area = "";
			// String region = "";
			String city = "";
			String county = "";
			String isp = "";
			for (int i = 0; i < temp.length; i++) {
				switch (i) {
				case 1:
					country = (temp[i].split(":"))[2].replaceAll("\"", "");
					country = decodeUnicode(country);// 国家
					break;
				case 3:
					area = (temp[i].split(":"))[1].replaceAll("\"", "");
					area = decodeUnicode(area);// 地区
					break;
				case 5:
					region = (temp[i].split(":"))[1].replaceAll("\"", "");
					region = decodeUnicode(region);// 省份
					break;
				case 7:
					city = (temp[i].split(":"))[1].replaceAll("\"", "");
					city = decodeUnicode(city);// 市区
					break;
				case 9:
					county = (temp[i].split(":"))[1].replaceAll("\"", "");
					county = decodeUnicode(county);// 地区
					break;
				case 11:
					isp = (temp[i].split(":"))[1].replaceAll("\"", "");
					isp = decodeUnicode(isp); // ISP公司
					break;
				}
			}

			 //System.out.println(country + "=" + area + "=" + region + "=" +
			 //city + "=" + county + "=" + isp);
			// return region + "," + city + "," + county;
			
			return city;
		}
		return null;

	}

	private String getResult(String urlStr, String content, String encoding) {

		URL url = null;
		HttpURLConnection connection = null;
		try {

			url = new URL(urlStr);
			connection = (HttpURLConnection) url.openConnection();// 新建连接实例
			connection.setConnectTimeout(20000);// 设置连接超时时间，单位毫秒
			connection.setReadTimeout(20000);// 设置读取数据超时时间，单位毫秒
			connection.setDoOutput(true);// 是否打开输出流 true|false
			connection.setDoInput(true);// 是否打开输入流true|false
			connection.setRequestMethod("POST");// 提交方法POST|GET
			connection.setUseCaches(false);// 是否缓存true|false
			connection.connect();// 打开连接端口
			DataOutputStream out = new DataOutputStream(connection.getOutputStream());// 打开输出流往对端服务器写数据
			out.writeBytes(content);// 写数据,也就是提交你的表单 name=xxx&pwd=xxx
			out.flush();// 刷新
			out.close();// 关闭输出流
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding));// 往对端写完数据对端服务器返回数据
			// ,以BufferedReader流来读取
			StringBuffer buffer = new StringBuffer();
			String line = "";

			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			reader.close();

			return buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect();// 关闭连接
			}
		}
		return null;

	}

	
	/** 
	 * @Title: decodeUnicode  
	 * @author kaka   
	 * @Description: unicode转换成中文    
	 * @param @param theString 
	 * @param @return     
	 * @return String    
	 * @throws 
	 */  
	public static String decodeUnicode(String theString) {
		char aChar;
		int len = theString.length();
		StringBuffer outBuffer = new StringBuffer(len);
		for (int x = 0; x < len;) {
			aChar = theString.charAt(x++);
			if (aChar == '\\') {
				aChar = theString.charAt(x++);
				if (aChar == 'u') {
					int value = 0;
					for (int i = 0; i < 4; i++) {
						aChar = theString.charAt(x++);
						switch (aChar) {
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
							value = (value << 4) + aChar - '0';
							break;
						case 'a':
						case 'b':
						case 'c':
						case 'd':
						case 'e':
						case 'f':
							value = (value << 4) + 10 + aChar - 'a';
							break;
						case 'A':
						case 'B':
						case 'C':
						case 'D':
						case 'E':
						case 'F':
							value = (value << 4) + 10 + aChar - 'A';
							break;
						default:
							throw new IllegalArgumentException("Malformed      encoding.");
						}
					}
					outBuffer.append((char) value);
				} else {
					if (aChar == 't') {
						aChar = '\t';
					} else if (aChar == 'r') {
						aChar = '\r';
					} else if (aChar == 'n') {
						aChar = '\n';
					} else if (aChar == 'f') {
						aChar = '\f';
					}
					outBuffer.append(aChar);
				}
			} else {
				outBuffer.append(aChar);
			}
		}
		return outBuffer.toString();

	}

	// 获取外网ip
	public static String getIpAddr() {
		String ip = "";
		String chinaz = "http://ip.chinaz.com";

		StringBuilder inputLine = new StringBuilder();
		String read = "";
		URL url = null;
		HttpURLConnection urlConnection = null;
		BufferedReader in = null;
		try {
			url = new URL(chinaz);
			urlConnection = (HttpURLConnection) url.openConnection();
			in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
			while ((read = in.readLine()) != null) {
				inputLine.append(read + "\r\n");
			}
			// System.out.println(inputLine.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		Pattern p = Pattern.compile("\\<dd class\\=\"fz24\">(.*?)\\<\\/dd>");
		Matcher m = p.matcher(inputLine.toString());
		if (m.find()) {
			String ipstr = m.group(1);
			ip = ipstr;
			// System.out.println(ipstr);
		}
		return ip;
	}

	public static String getIpAddr( final HttpServletRequest request)  throws Exception {
		String ip = request.getHeader("x-forwarded-for");   
	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {   
	           ip = request.getHeader("Proxy-Client-IP");   
	       }   
	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {   
	           ip = request.getHeader("WL-Proxy-Client-IP");   
	       }   
	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {   
	           ip = request.getRemoteAddr();   
	           if(ip.equals("127.0.0.1")){     
	               //根据网卡取本机配置的IP     
	               InetAddress inet=null;     
	               try {     
	                   inet = InetAddress.getLocalHost();     
	               } catch (Exception e) {     
	                   e.printStackTrace();     
	               }     
	               ip= inet.getHostAddress();     
	           }  
	       }   
	       // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割  
	       if(ip != null && ip.length() > 15){    
	           if(ip.indexOf(",")>0){     
	               ip = ip.substring(0,ip.indexOf(","));     
	           }     
	       }     
	       return ip;
	  
	}

	
	public static void main(String[] args) throws Exception {

		AddressUtils addressUtils = new AddressUtils();
		String ip = "192.168.1.100";//124.202.178.178
		//String ip = "10.28.78.176";
		String address = "";
		address = addressUtils.getAddresses("ip="+ ip);
		System.out.println("address:"+address);
		//String str = getIpAddr();
		//System.out.println(str);
		
	}
	
	
}
