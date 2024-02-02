package br.com.fabex.aspects.components;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingTimeExecutionAspect {

    /**
     * Apply logic when used with annotation @LogExecutionTime.
     *
     * @param joinPoint
     * @return Object
     * @throws Throwable
     */
    @Around("@annotation(br.com.fabex.aspects.annotations.LogExecutionTime)")
    public Object logExecutionTime(final ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("LoggingTimeExecutionAspect::logExecutionTime " + joinPoint.getSignature() + " executed in " + (endTime - startTime) + "ms");
        return proceed;
    }

    /**
     * Apply logic for whichever method call on package: br.com.fabex.aspects.services
     * (only package - not applied to package "br.com.fabex.aspects.services.bo").
     *
     * @param joinPoint
     * @return Object
     * @throws Throwable
     */
    @Around("execution(* br.com.fabex.aspects.services.*.*(..))")
    public Object helloForWhicheverMethodExecution(final ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("LoggingTimeExecutionAspect::helloForWhicheverMethodExecution::" + joinPoint.getSignature());
        return joinPoint.proceed();
    }
}
