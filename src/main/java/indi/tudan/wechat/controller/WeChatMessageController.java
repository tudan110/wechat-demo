package indi.tudan.wechat.controller;

import cn.zhouyafeng.itchat4j.api.MessageTools;
import cn.zhouyafeng.itchat4j.core.Core;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息控制器
 *
 * @author wangtan
 * @date 2019-12-03 14:48:55
 * @since 1.0
 */
@Slf4j
@RestController
@RequestMapping("wechat")
public class WeChatMessageController {

    /**
     * 打印个人信息，包含好友、公众号等等
     * http://127.0.0.1:8080/wechat/core
     *
     * @return 返回信息
     * @date 2019-12-03 15:19:10
     */
    @GetMapping("core")
    public JSONObject getCore() {
        JSONObject result = new JSONObject();

        Core core = Core.getInstance();
        core.getContactList().forEach(p -> {
            System.out.println("昵称: " + p.getString("NickName") + "\t\t" + "用户名: " + p.getString("UserName"));
            //Console.log("昵称: {}\t\t用户名: {}", p.getString("NickName"), p.getString("UserName"));
        });

        return result
                .fluentPut("status", 200)
                .fluentPut("message", "");
    }

    /**
     * 发送消息
     * http://127.0.0.1:8080/wechat/send?msg=测试，能收到消息嘛&nickName=?
     *
     * @param msg      消息内容
     * @param nickName 昵称
     * @return 返回信息
     * @date 2019-12-03 16:20:35
     */
    @GetMapping("send")
    public JSONObject sendMsg(@RequestParam(value = "msg") String msg,
                              @RequestParam(value = "nickName") String nickName) {
        JSONObject result = new JSONObject();

        MessageTools.sendMsgByNickName(msg, nickName);

        return result
                .fluentPut("status", 200)
                .fluentPut("message", msg);
    }
}
