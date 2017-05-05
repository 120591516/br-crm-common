package br.crm.common.utils; 
import java.util.Random;

import br.crm.common.alipay.util.UtilDate;


public class OrderIDUtils {
	
	/**
	 * 订单id生成
	 */
	public synchronized static long genOrderId() {
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//long millis = System.nanoTime();
		//加上两位随机数
		Random random = new Random();
		int end2 = random.nextInt(999999);
		//如果不足两位前面补0
		String str = millis + String.format("%06d", end2);
		long id = new Long(str);
		return id;
	}
	/**
	 * 退款订单id生成
	* @Title: main 
	* @Description: TODO
	* @param @param args    
	* @return void    
	* @throws
	 */
	public synchronized static String getOrderRefundId() {
		return UtilDate.getDate()+UtilDate.getThree();
	}

	
    public static void main(String args[]){
    	for (int i = 0; i <10; i++) {
    		System.out.println(OrderIDUtils.genOrderId());
		}
    }
}
