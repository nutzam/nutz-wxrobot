# nutz-wxrobot

个人账户微信机器人(非公众号)

## TODO

* [x] 获取登录二维码
* [x] 模拟网页登录过程
* [x] 获取联系人列表
* [x] 解决retcode:1100的问题
* [x] 简单的响应文字信息
* [x] log中显示登录二维码，方便服务器部署
* [ ] 自动添加好友
* [ ] 文档：如何注册一个新的微信号（个人）
* [ ] 解决Remote host closed connection during handshake
* [ ] 响应其他类型信息
* [ ] 补充文档
* [ ] 设计主页&logo
* [ ] web版监控页面
* [ ] web版控制台

## 运行时可能遇到的问题

1. 报错：Could not generate DH keypair

```java
Exception in thread "main" org.nutz.http.HttpException: url=https://login.weixin.qq.com/jslogin?appid=wx782c26e4c19acffb&fun=new&lang=zh_CN&_=1470996468968
	at org.nutz.http.sender.GetSender.send(GetSender.java:22)
	at org.nutz.wxrobot.Client.QR_UUID(Client.java:61)
	at org.nutz.wxrobot.Client.run(Client.java:147)
	at org.nutz.wxrobot.Launcher.main(Launcher.java:7)
Caused by: javax.net.ssl.SSLException: java.lang.RuntimeException: Could not generate DH keypair
	at com.sun.net.ssl.internal.ssl.Alerts.getSSLException(Alerts.java:190)
	at com.sun.net.ssl.internal.ssl.SSLSocketImpl.fatal(SSLSocketImpl.java:1747)
	at com.sun.net.ssl.internal.ssl.SSLSocketImpl.fatal(SSLSocketImpl.java:1708)
	at com.sun.net.ssl.internal.ssl.SSLSocketImpl.handleException(SSLSocketImpl.java:1691)
	at com.sun.net.ssl.internal.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1222)
	at com.sun.net.ssl.internal.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1199)
	at sun.net.www.protocol.https.HttpsClient.afterConnect(HttpsClient.java:476)
	at sun.net.www.protocol.https.AbstractDelegateHttpsURLConnection.connect(AbstractDelegateHttpsURLConnection.java:166)
	at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1195)
	at java.net.HttpURLConnection.getResponseCode(HttpURLConnection.java:379)
	at sun.net.www.protocol.https.HttpsURLConnectionImpl.getResponseCode(HttpsURLConnectionImpl.java:318)
	at org.nutz.http.Sender.getResponseHeader(Sender.java:124)
	at org.nutz.http.sender.GetSender.send(GetSender.java:19)
	... 3 more
```

目前看好像是macOS上jdk才会有这个问题， 最简单的解决方法就是切换到jdk8, 其他解决方案请查看[http://stackoverflow.com/questions/6851461/java-why-does-ssl-handshake-give-could-not-generate-dh-keypair-exception](http://stackoverflow.com/questions/6851461/java-why-does-ssl-handshake-give-could-not-generate-dh-keypair-exception)

## 参考文档

1. [http://freezingsky.iteye.com/blog/2055502](http://freezingsky.iteye.com/blog/2055502)
2. [http://www.tanhao.me/talk/1466.html/](http://www.tanhao.me/talk/1466.html/)
3. [https://github.com/biezhi/wechat-robot/blob/master/doc/protocol.md](https://github.com/biezhi/wechat-robot/blob/master/doc/protocol.md)
4. [http://blog.csdn.net/liuguangqiang/article/details/52130782](http://blog.csdn.net/liuguangqiang/article/details/52130782)
5. [http://leo108.com/pid-2161.asp](http://leo108.com/pid-2161.asp)
6. [http://ask.seowhy.com/article/27](http://ask.seowhy.com/article/27)
7. [http://www.07net01.com/2016/01/1201188.html](http://www.07net01.com/2016/01/1201188.html)

## 参考项目

1. [littlecodersh/ItChat](https://github.com/littlecodersh/ItChat):Python版微信机器人
2. [biezhi/wechat-robot](https://github.com/biezhi/wechat-robot):Java版微信机器人
3. [https://github.com/zhex/go-qrcode-terminal](https://github.com/zhex/go-qrcode-terminal):Golang命令行下输出二维码




