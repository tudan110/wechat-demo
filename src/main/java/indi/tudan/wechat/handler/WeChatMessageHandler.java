package indi.tudan.wechat.handler;

import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import com.alibaba.fastjson.JSONObject;

/**
 * 微信消息处理
 *
 * @author wangtan
 * @date 2019-12-03 14:44:14
 * @since 1.0
 */
public class WeChatMessageHandler implements IMsgHandlerFace {

    @Override
    public String textMsgHandle(JSONObject jsonObject) {
        return "";
    }

    @Override
    public String picMsgHandle(JSONObject jsonObject) {
        return "";
    }

    @Override
    public String voiceMsgHandle(JSONObject jsonObject) {
        return "";
    }

    @Override
    public String viedoMsgHandle(JSONObject jsonObject) {
        return "";
    }

    @Override
    public String nameCardMsgHandle(JSONObject jsonObject) {
        return "";
    }

}
