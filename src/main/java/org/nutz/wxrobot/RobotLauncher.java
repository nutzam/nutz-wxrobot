package org.nutz.wxrobot;

public class RobotLauncher {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setMsgHandler(new DefaultMsgHandler());
        robot.run();
    }
}
