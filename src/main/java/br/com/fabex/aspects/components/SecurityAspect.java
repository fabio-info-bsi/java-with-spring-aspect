package br.com.fabex.aspects.components;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SecurityAspect {

    @Around("@annotation(br.com.fabex.aspects.annotations.ControllAccessBusiness)")
    public Object verify(final ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("SecurityAspect::verify " + joinPoint.getSignature());
        return joinPoint.proceed();
    }
}
