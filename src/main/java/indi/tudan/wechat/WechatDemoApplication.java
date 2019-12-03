package indi.tudan.wechat;

import cn.zhouyafeng.itchat4j.Wechat;
import indi.tudan.wechat.handler.WeChatMessageHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 程序入口
 */
@SpringBootApplication
@EnableScheduling
public class WechatDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(WechatDemoApplication.class, args);

        String qrPath = "C:/Users/tudan/Desktop/wechat-files/itchat4j/login";

        Wechat wechat = new Wechat(new WeChatMessageHandler(), qrPath);
        wechat.start();

    }

}
