package org.nutz.wxrobot.bean;

import org.nutz.lang.random.R;
import org.nutz.lang.util.NutMap;

@SuppressWarnings("serial")
public class WxOutMsg extends NutMap {

    public WxOutMsg setType(int msgType) {
        put("Type", msgType);
        return this;
    }

    public int getType() {
        return getInt("Type");
    }

    public WxOutMsg setFromUserName(String fromUserName) {
        put("FromUserName", fromUserName);
        return this;
    }

    public String getFromUserName() {
        return (String) get("FromUserName");
    }

    public WxOutMsg setToUserName(String toUserName) {
        put("ToUserName", toUserName);
        return this;
    }

    public String getToUserName() {
        return (String) get("ToUserName");
    }

    public WxOutMsg setContent(String content) {
        put("Content", content);
        return this;
    }

    public String getContent() {
        return (String) get("Content");
    }

    public WxOutMsg setLocalID(String localID) {
        put("LocalID", localID);
        return this;
    }

    public String getClientMsgId() {
        return (String) get("ClientMsgId");
    }

    public WxOutMsg setClientMsgId(String clientMsgId) {
        put("ClientMsgId", clientMsgId);
        return this;
    }

    public String getLocalID() {
        return (String) get("LocalID");
    }

    // ------------------------------- 执行类型的WxOutMsg

    public static WxOutMsg createText(String content) {
        WxOutMsg outMsg = new WxOutMsg();
        outMsg.put("Type", 1);
        outMsg.put("Content", content);
        outMsg.put("LocalID", System.currentTimeMillis() + R.random(1000, 9999));
        outMsg.put("ClientMsgId", System.currentTimeMillis() + R.random(1000, 9999));
        return outMsg;
    }

}
