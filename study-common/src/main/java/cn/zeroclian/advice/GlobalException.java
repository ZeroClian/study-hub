package cn.zeroclian.advice;

import cn.zeroclian.result.ResultCode;

/**
 * 自定义全局异常
 *
 * @author ZeroClian
 * @date 2021-09-09 2:27 下午
 */
public class GlobalException extends RuntimeException {

    private final ResultCode result;

    public GlobalException(String message) {
        super(message);
        this.result = ResultCode.SYSTEM_EXECUTION_ERROR;
    }

    public GlobalException(ResultCode result) {
        this(result, null);
    }

    public GlobalException(ResultCode result, String message) {
        super(message);
        this.result = result;
    }

    public ResultCode getResult() {
        return result;
    }
}
