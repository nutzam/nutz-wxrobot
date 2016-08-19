package org.nutz.wxrobot.bean;

import org.nutz.lang.util.NutMap;

@SuppressWarnings("serial")
public class WxInMsg extends NutMap {

    public WxInMsg setMsgType(int msgType) {
        put("MsgType", msgType);
        return this;
    }

    public int getMsgType() {
        return getInt("MsgType");
    }

    public WxInMsg setFromUserName(String fromUserName) {
        put("FromUserName", fromUserName);
        return this;
    }

    public String getFromUserName() {
        return (String) get("FromUserName");
    }

    public WxInMsg setToUserName(String toUserName) {
        put("ToUserName", toUserName);
        return this;
    }

    public String getToUserName() {
        return (String) get("ToUserName");
    }

    public WxInMsg setContent(String content) {
        put("Content", content);
        return this;
    }

    public String getContent() {
        return (String) get("Content");
    }

    public WxInMsg setMsgID(long msgID) {
        put("MsgID", msgID);
        return this;
    }

    public String getMsgID() {
        return getString("MsgID");
    }

}
