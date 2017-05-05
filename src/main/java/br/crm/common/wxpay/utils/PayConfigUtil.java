package br.crm.common.wxpay.utils;

public final class PayConfigUtil {

	public static final String APP_ID = "wxffc4a97f93ab8c6f";// 公众账号

	public static final String mch_id = "1386692102";// 商户号

	public static final String API_KEY = "Wz1ooa5r4ftGfbaf3jcxNM1M2FZhMJgu";// key
	
	public static final String body = "标软支付-微信扫码支付中心";//商品名称
	
	public static final String AppSecret = "ca7e9ed989aceeb6ff93a01c1939eb8a";//AppSecret
	
	public static final String Token = "bjbrwxwebpay";//Token
	
	public static final String EncodingAESKey = "4rxi1LqA0Kp0XkodZzbVgFWdVPECcgqJVlWAB9wkSTG";//EncodingAESKey

	public static final String trade_type = "NATIVE";// key
	
	public static final String p12path = "/usr/local/cert/apiclient_cert.p12";//证书path

	// 有关URL
	// 1）统一下单
	public static String PAY_API = "https://api.mch.weixin.qq.com/pay/unifiedorder";
	// 2）回调地址
	public static String NOTIFY_URL = "http://218.94.129.122:8083/br-order-user-controller/cusOrderCus/notifyURL";
	// 3）查询订单
	public static String orderquery = "https://api.mch.weixin.qq.com/pay/orderquery";
	// 4）申请退款
	public static String payrefund = "https://api.mch.weixin.qq.com/secapi/pay/refund";
	

}
