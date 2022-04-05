package cn.zeroclian.result;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ZeroClian
 * @date 2022-04-04 6:28 下午
 */
@AllArgsConstructor
@NoArgsConstructor
public enum ResultCode implements IResult, Serializable {

    /**
     * 结果枚举
     */
    SUCCESS("200", "成功"),
    SYSTEM_EXECUTION_ERROR("500", "系统执行出错"),
    USERNAME_OR_PASSWORD_ERROR("301", "用户名或密码错误"),
    USER_NOT_EXIST("302", "用户不存在"),
    CLIENT_AUTHENTICATION_FAILED("303", "客户端认证失败"),
    ACCESS_UNAUTHORIZED("304", "未授权"),
    TOKEN_INVALID_OR_EXPIRED("305", "token非法或失效"),
    TOKEN_ACCESS_FORBIDDEN("306", "token禁止访问"),
    FLOW_LIMITING("307", "系统限流"),
    DEGRADATION("308", "系统功能降级"),
    SERVICE_NO_AUTHORITY("309", "服务未授权");

    private String code;
    private String message;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResultCode{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
