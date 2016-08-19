package org.nutz.wxrobot;

import org.nutz.wxrobot.bean.WxInMsg;
import org.nutz.wxrobot.bean.WxOutMsg;

public class Wxs {

    /**
     * 根据输入信息,修正发送信息的发送者和接受者
     */
    public static WxOutMsg fix(WxInMsg in, WxOutMsg out) {
        out.setFromUserName(in.getToUserName());
        out.setToUserName(in.getFromUserName());
        return out;
    }

}
