package com.helian.health.exception;

import com.helian.health.util.JsonResult;
import com.helian.health.util.ResultCode;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@ControllerAdvice
public class ExceptionHandler {

    private Logger logger = Logger.getLogger(ExceptionHandler.class);

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public JsonResult errorHandler(HttpServletRequest request, Exception e) {
        logger.error("发生异常的url:" + request.getRequestURL().toString());
        logger.error("异常信息：" + e.getMessage().toString(), e);
        return new JsonResult(ResultCode.ERROR_SYSTEM);
    }
}
