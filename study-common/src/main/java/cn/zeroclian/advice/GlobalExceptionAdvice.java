package cn.zeroclian.advice;

import cn.zeroclian.result.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;

/**
 * @Desciption 全局异常处理器
 * @Author: ZeroClian
 * @Date: 2021-09-09 2:34 下午
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(GlobalException.class)
    public Result<Object> handleGlobalException(GlobalException ge) {
        Result<Object> result = new Result<>();
        result.setCode(ge.getResult().getCode());
        result.setMessage(Objects.isNull(ge.getMessage()) ? ge.getResult().getMessage() : ge.getMessage());
        return result;
    }

}
