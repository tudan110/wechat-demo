package indi.tudan.wechat.service;

/**
 * 微信登录服务接口
 *
 * @author wangtan
 * @date 2019-12-04 10:52:20
 * @since 1.0
 */
public interface IWechatLogin {

    /**
     * 微信登录接口
     *
     * @date 2019-12-04 10:54:09
     */
    void login();

    /**
     * 微信退出接口
     *
     * @date 2019-12-04 13:34:55
     */
    void logout();

}
