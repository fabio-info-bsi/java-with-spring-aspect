package br.com.fabex.aspects.components;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class TraceBusinessAspect {

    @Before(value = "@annotation(br.com.fabex.aspects.annotations.TraceBusiness)")
    public void logBefore(final JoinPoint joinPoint) throws Throwable {
        System.out.println("TraceBusinessAspect::logBefore " + Arrays.asList(joinPoint.getArgs()));

    }

    @AfterReturning(value = "@annotation(br.com.fabex.aspects.annotations.TraceBusiness)", returning = "returnedValue")
    public void logReturn(Object returnedValue) {
        System.out.println("TraceBusinessAspect::logReturn " + returnedValue);
    }
}
