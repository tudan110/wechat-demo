package indi.tudan.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 程序入口
 */
@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties
public class WechatDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(WechatDemoApplication.class, args);

    }

}
