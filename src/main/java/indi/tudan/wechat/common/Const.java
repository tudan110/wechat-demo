package indi.tudan.wechat.common;

/**
 * 常量及枚举
 *
 * @author wangtan
 * @date 2019-12-04 10:10:59
 * @since 1.0
 */
public class Const {

    /**
     * 发布版本字符串
     */
    public static final String RELEASE_MODE = "release";

    /**
     * Http 状态
     *
     * @date 2019-12-04 10:11:05
     */
    public enum HttpStatus {

        // Http 状态
        SUCCESS(200),
        NOTFOUND(404);

        private int status;

        HttpStatus(int status) {
            this.status = status;
        }

        public int getStatus() {
            return this.status;
        }
    }
}
