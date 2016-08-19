package org.nutz.wxrobot;

import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.wxrobot.bean.WxInMsg;
import org.nutz.wxrobot.bean.WxOutMsg;

/**
 * 默认的处理器
 * 
 * @author pw
 */
public class DefaultMsgHandler implements MsgHandler {

    private Log log = Logs.get();
    private Robot robot;

    protected void setRobot(Robot robot) {
        this.robot = robot;
    }

    @Override
    public boolean handle(WxInMsg in) {
        int mtype = in.getMsgType();
        log.infof("MsgHandler TP: %d", mtype);
        switch (mtype) {
        // 文字消息
        case 1:
            return text(in);
        // 加好友
        case 37:
            return text(in);
        // TODO 其他类型
        default:
        }
        return false;
    }

    @Override
    public boolean dft(WxInMsg in) {
        return false;
    }

    @Override
    public boolean text(WxInMsg in) {
        WxOutMsg out = WxOutMsg.createText("收到消息:" + in.getContent());
        Wxs.fix(in, out);
        return robot.sendMsg(out);
    }

    @Override
    public boolean addFriend(WxInMsg in) {
        return false;
    }

    @Override
    public boolean video(WxInMsg in) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean voice(WxInMsg in) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean file(WxInMsg in) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean redEnvelope(WxInMsg in) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean nameCard(WxInMsg in) {
        // TODO Auto-generated method stub
        return false;
    }

}
