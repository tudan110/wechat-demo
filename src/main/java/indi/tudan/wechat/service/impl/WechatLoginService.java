package indi.tudan.wechat.service.impl;

import cn.zhouyafeng.itchat4j.Wechat;
import cn.zhouyafeng.itchat4j.api.WechatTools;
import indi.tudan.wechat.common.yaml.WechatYaml;
import indi.tudan.wechat.handler.WeChatMessageHandler;
import indi.tudan.wechat.service.IWechatLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 微信登录服务
 *
 * @author wangtan
 * @date 2019-12-04 10:53:18
 * @since 1.0
 */
@Service
public class WechatLoginService implements IWechatLogin {

    @Autowired
    private WechatYaml wechatYaml;

    /**
     * 微信登录
     *
     * @date 2019-12-04 10:54:26
     */
    @Override
    public void login() {
        new Wechat(new WeChatMessageHandler(), wechatYaml.getLogin().getQrPath())
                .start();
    }

    /**
     * 微信退出接口
     *
     * @date 2019-12-04 13:35:22
     */
    @Override
    public void logout() {
        //WechatTools.logout();
    }

}
