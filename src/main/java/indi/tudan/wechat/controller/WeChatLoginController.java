package indi.tudan.wechat.controller;

import cn.hutool.core.lang.Console;
import cn.zhouyafeng.itchat4j.core.Core;
import com.alibaba.fastjson.JSONObject;
import indi.tudan.wechat.common.Const;
import indi.tudan.wechat.service.IWechatLogin;
import indi.tudan.wechat.utils.WebUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 微信登录控制器
 *
 * @author wangtan
 * @date 2019-12-04 09:54:56
 * @since 1.0
 */
@Slf4j
@RestController
public class WeChatLoginController {

    @Autowired
    private IWechatLogin iWechatLogin;

    /**
     * 登录微信
     *
     * @return 返回信息
     * @date 2019-12-04 09:58:06
     */
    @GetMapping("login")
    public JSONObject login() {
        iWechatLogin.login();
        return WebUtils.result(Const.HttpStatus.SUCCESS.getStatus(), "登录成功。");
    }

    /**
     * 打印个人信息，包含好友、公众号等等
     * http://127.0.0.1:8080/wechat/console/core
     *
     * @return 返回信息
     * @date 2019-12-03 15:19:10
     */
    @GetMapping("console/core")
    public JSONObject getCore() {

        Core core = Core.getInstance();
        core.getContactList().forEach(p -> {
            Console.log("备注: {}\t\t\t\t昵称: {}\t\t\t\t用户名: {}",
                    p.getString("RemarkName"),
                    p.getString("NickName"),
                    p.getString("UserName"));
        });
        core.getGroupList().forEach(p -> {
            Console.log("备注: {}\t\t\t\t昵称: {}\t\t\t\t用户名: {}",
                    p.getString("RemarkName"),
                    p.getString("NickName"),
                    p.getString("UserName"));
        });

        return WebUtils.result(Const.HttpStatus.SUCCESS.getStatus(), "打印成功。");
    }

}
