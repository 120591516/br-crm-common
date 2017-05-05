package br.crm.common.utils;

import java.util.HashMap;
import java.util.Map;

import com.linkage.netmsg.NetMsgclient;
import com.linkage.netmsg.server.ReceiveMsg;
import com.linkage.netmsg.server.ReceiveMsgImpl;

public class SendSmsUtils {

    private static String userName = "025C00359168";

    private static String password = "272105";

    private static String ipAddress = "202.102.41.101";

    private static int port = 9005;

    private static NetMsgclient client = null;

    public static Map<String, Object> SendSms(String mobile, String contents) {

        Map<String, Object> map = new HashMap<String, Object>();
        try {
            client = new NetMsgclient();

            ReceiveMsg receiveMsg = new ReceiveMsgImpl();
            // 初始化参数(ip,端口,用户名,密码, 接受ReceiveMsg的实力)
            client.initParameters(ipAddress, port, userName, password, receiveMsg);
            // 登录认证
            boolean isLogin = client.anthenMsg(client);
            if (isLogin) {
                System.out.println("login sucess");
                // 开始发送短信返回    列号id--150611001
                String sendMsg = client.sendMsg(client, 0, mobile, new String("您的验证码是：") + contents + "。请不要把验证码泄露给其他人。",
                        1);
                if (sendMsg.length() == 16) {
                    client.closeConn();
                }
                map.put("seqId", sendMsg);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            client.closeConn();
        }
        return map;
    }

    // 测试
    public static void main(String[] args) {
        SendSms("18268888717", "8888");
    }

}
