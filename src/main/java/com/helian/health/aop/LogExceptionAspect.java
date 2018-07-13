package com.helian.health.aop;

import com.helian.health.util.JsonResult;
import com.helian.health.util.ResultCode;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * 使用spring aop记录异常日志，将业务代码与异常代码分隔，避免污染
 */
@Aspect
//@Component
public class LogExceptionAspect {

    private Logger logger = Logger.getLogger(LogExceptionAspect.class);

    @Pointcut(value = "execution(public * com.helian.health.controller..*.*(..)) && " +
            "@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void writeLog() {
    }

    @Around(value = "writeLog()")
    public Object processTx(ProceedingJoinPoint joinPoint) {
        logger.info("执行目标方法前开始。。。");
        MethodSignature ms = (MethodSignature) joinPoint.getSignature();
        Object o = null;
        try {
            o = joinPoint.proceed();
            logger.info("执行方法之后结束");
            return o;
        } catch (Exception e) {
            logger = Logger.getLogger(joinPoint.getTarget().getClass());
            logger.error("发生异常的类：" +joinPoint.getTarget().getClass() + "---发生异常的方法--："
                   + ms.getMethod().getName() + "----异常信息-----" + e.getMessage(),e);
            return new JsonResult(ResultCode.ERROR_SYSTEM);
        } catch (Throwable throwable) {
            logger = Logger.getLogger(joinPoint.getTarget().getClass());
            logger.error("发生异常的类：" +joinPoint.getTarget().getClass() + "---发生异常的方法--："
                    + ms.getMethod().getName() + "----异常信息-----" + throwable.getMessage(),throwable);
            return new JsonResult(ResultCode.ERROR_SYSTEM);
        }
    }
}
