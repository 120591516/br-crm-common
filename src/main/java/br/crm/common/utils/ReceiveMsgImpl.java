package br.crm.common.utils;

import java.util.HashMap;
import java.util.Map;

public class ReceiveMsgImpl extends ReceiveMsg {

    public Map<String, String> result = new HashMap<String, String>();

    @Override
    public void getAnswer(AnswerBean answerBean) {
        // 获取下行短信返回状态和短信ID的方法
        // 序列Id 150611001
        String seqId = answerBean.getSeqId();
        // 短信状态 0
        int status = answerBean.getStatus();
        // 下行短信ID I20170324150620030622
        String msgId = answerBean.getMsgId();
        System.out.println("AnswerBean seqIdString:" + seqId);
        System.out.println("AnswerBean status:" + status);
        System.out.println("AnswerBean msgId:" + msgId);
    }

    // 获取下行短信回执的方法
    @Override
    public void getReturnMsg(ReturnMsgBean returnMsgBean) {
        String sequenceId = returnMsgBean.getSequenceId();
        /* 短信的msgId */ // 20170324150629030641
        String msgId = returnMsgBean.getMsgId();
        /* 发送号码 */ // 18268888717
        String sendNum = returnMsgBean.getSendNum();
        /* 接收号码 */ // 77600002583272105
        String receiveNum = returnMsgBean.getReceiveNum();
        /* 短信提交时间 */ // 1703241506
        String submitTime = returnMsgBean.getSubmitTime();
        /* 短信下发时间 */ // 1703241506
        String sendTime = returnMsgBean.getSendTime();
        /* 短信状态 */ // DELIVRD
        String msgStatus = returnMsgBean.getMsgStatus();
        /* 短信错误代码 */ // 0
        int msgErrStatus = returnMsgBean.getMsgErrStatus();

        // 此处加入接收短信回执的处理代码
        System.out.println("ReturnMsgBean sequenceId: " + sequenceId);
        System.out.println("ReturnMsgBean msgId: " + msgId);
        System.out.println("ReturnMsgBean sendNum: " + sendNum);
        System.out.println("ReturnMsgBean receiveNum: " + receiveNum);
        System.out.println("ReturnMsgBean submitTime: " + submitTime);
        System.out.println("ReturnMsgBean sendTime: " + sendTime);
        System.out.println("ReturnMsgBean msgStatus: " + msgStatus);
        System.out.println("ReturnMsgBean msgErrStatus: " + msgErrStatus);
    }

}
