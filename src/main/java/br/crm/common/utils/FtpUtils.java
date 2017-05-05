package br.crm.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPReply;

public class FtpUtils {

	private static FTPClient ftpClient;
	private String fileName, strencoding;
	private String ip = "192.168.1.254"; // FTP地址
	// private String userName = "report"; // 用户名
	// private String userPwd = "report"; // 密码
	private String userName = "anonymous"; // 用户名
	private String userPwd = ""; // 密码
	private int port = 21; // 端口号
	private String path = "/";// 读取文件的存放目录

	/**
	 * init ftp servere
	 */
	public FtpUtils(String fileName) {
		this.reSet(fileName);
	}

	public void reSet(String fileName) {
		// 文件名  zhangsan.pdf
		this.fileName = fileName;
		strencoding = "UTF-8";
		this.connectServer(ip, port, userName, userPwd, path);
	}

	public void connectServer(String ip, int port, String userName, String userPwd, String path) {

		ftpClient = new FTPClient();
		try {
			// 连接
			ftpClient.connect(ip, port);

			if (FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
				System.out.println("连接成功");
				ftpClient.login(userName, userPwd);
			}
			ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
			// 设置windows环境
			FTPClientConfig conf = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
			ftpClient.configure(conf);
			// 判断是否连接成功
			int reply = ftpClient.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftpClient.disconnect();
				System.out.println("FTP server refused connection.");
				return;
			}
			if (path != null && path.length() > 0) { // 跳转到指定目录
				ftpClient.changeWorkingDirectory(path);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String readFile() {
		File filedir = new File("upload/report/exam/");
		if (!filedir.exists()) {
			filedir.mkdirs();
		}
		File localFile = new File("upload/report/exam/" + fileName);
		try {
			OutputStream ios = new FileOutputStream(localFile);
			ftpClient.retrieveFile(fileName, ios);
			ios.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return localFile.getAbsolutePath().toString();

	}


	/**
	 * @Title: closeServer @Description: TODO(关闭链接) @param 设定文件 @return void
	 *         返回类型 @throws
	 */
	public void closeServer() {
		if (ftpClient.isConnected()) {
			try {
				ftpClient.logout();
				ftpClient.disconnect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

	}
}
