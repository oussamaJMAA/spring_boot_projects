package tn.esprit.firstproject.services;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    /*
    @Before("execution(* tn.esprit.firstproject.services.SkieurServiceIMP.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    */

@After("execution(* tn.esprit.firstproject.services.SkieurServiceIMP.addSkieur(..))")
    public void logMethodExit(JoinPoint joinPoint) {
    String name = joinPoint.getSignature().getName();
    log.info("In method " + name + " : ");
}
@Around("execution(* tn.esprit.firstproject.services.SkieurServiceIMP.addSkieur(..))")
    public void logMethodAround(JoinPoint joinPoint) {
    String name = joinPoint.getSignature().getName();
    log.info("In method " + name + " :)");
}
}
