package org.nutz.wxrobot;

import org.nutz.wxrobot.bean.WxInMsg;

public interface MsgHandler {

    /**
     * 处理信息（根据类型进行自动选择处理方式）
     * 
     * @param in
     * @return
     */
    boolean handle(WxInMsg in);

    /**
     * 默认处理方法
     * 
     * @param in
     * @return 是否成功
     */
    boolean dft(WxInMsg in);

    /**
     * 处理文字类型
     * 
     * @param in
     * @return 是否成功
     */
    boolean text(WxInMsg in);

    boolean video(WxInMsg in);

    boolean voice(WxInMsg in);

    boolean file(WxInMsg in);

    boolean redEnvelope(WxInMsg in);

    boolean nameCard(WxInMsg in);

    /**
     * 添加好友申请
     * 
     * @param in
     * @return 是否成功
     */
    boolean addFriend(WxInMsg in);

}
