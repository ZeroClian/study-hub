package cn.zeroclian.advice;

import cn.zeroclian.annotation.IgnoreResponseAdvice;
import cn.zeroclian.result.Result;
import cn.zeroclian.result.ResultCode;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 统一数据响应增强
 *
 * @Author: ZeroClian
 * @Date: 2021-09-09 1:52 下午
 */
@RestControllerAdvice
public class CommonResponseAdvice implements ResponseBodyAdvice {

    /**
     * 判断是否需要对响应进行处理
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        // 如果当前方法所在的类标识了 @IgnoreResponseAdvice 注解, 不需要处理
        if (methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreResponseAdvice.class)) {
            return false;
        }
        // 如果当前方法标识了 @IgnoreResponseAdvice 注解, 不需要处理
        return !methodParameter.getMethod().isAnnotationPresent(IgnoreResponseAdvice.class);
    }

    /**
     * 响应返回之前的处理
     */
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        Result<Object> result;
        if (o instanceof Result) {
            result = (Result<Object>) o;
        } else {
            result = Result.result(ResultCode.SUCCESS, o);
        }
        return result;
    }
}
