package br.com.fabex.aspects.components;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AclAspect {

    @Around("@annotation(br.com.fabex.aspects.annotations.ControllAccessBusiness)")
    public Object verify(final ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AclAspect::verify " + joinPoint.getSignature());
        return joinPoint.proceed();
    }
}
