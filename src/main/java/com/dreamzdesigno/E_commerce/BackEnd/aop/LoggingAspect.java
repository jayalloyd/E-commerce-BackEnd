package com.dreamzdesigno.E_commerce.BackEnd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final  Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);


    public LoggingAspect() {
        System.out.println("🚀 LoggingAspect Initialized!");
        LOGGER.info("🚀 LoggingAspect Initialized!");
    }
//return type,classname,method name, args
@Before("execution(* com.dreamzdesigno.E_commerce.BackEnd.Service.ProductService.createListing(..))")

//@Before("execution(* com.dreamzdesigno.E_commerce.BackEnd.ProductService.createListing(..))")
public void beforeCreateListingAdvice(JoinPoint joinPoint) {
    LOGGER.info("Before executing createListing method: " + joinPoint.getSignature().getName());
    LOGGER.info("method callled");
}
    @After("execution(* com.dreamzdesigno.E_commerce.BackEnd.Service.ProductService.createListing(..))")
    public void afterCreateListingAdvice(JoinPoint joinPoint) {
        System.out.println("🔥 Inside @After Advice for createListing");
        LOGGER.info("🔥 Inside @After Advice for createListing: " + joinPoint.getSignature());
    }}
