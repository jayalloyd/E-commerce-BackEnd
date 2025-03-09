package com.dreamzdesigno.E_commerce.BackEnd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.mapping.Join;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final  Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);


    public LoggingAspect() {
        System.out.println(" LoggingAspect Initialized!");
        LOGGER.info(" LoggingAspect Initialized!");
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
        System.out.println(" Inside @After Advice for createListing");
        LOGGER.info("Inside @After Advice for createListing: " + joinPoint.getSignature());
    }
    @Before("execution(* com.dreamzdesigno.E_commerce.BackEnd.Repo.ProductRepo.findAll(..))")
    public void beforeGetProducts(JoinPoint joinPoint){
        LOGGER.info("Before executing get all products:"+joinPoint.getSignature().getName());
    }
    @After("execution(* com.dreamzdesigno.E_commerce.BackEnd.Repo.ProductRepo.findAll(..))")
    public void afterGetProducts(JoinPoint joinPoint){
        LOGGER.info("After executing get all products:"+joinPoint.getSignature().getName());
    }
    @Before("execution(* com.dreamzdesigno.E_commerce.BackEnd.Repo.ProductRepo.deleteProductByProductName(..)) && args(productName)")

    public  void beforeDeleteProductByProductName(JoinPoint joinPoint,String productName){
        LOGGER.info("Before executing delete products by product name:"+joinPoint.getSignature().getName());

    }
    @After("execution(* com.dreamzdesigno.E_commerce.BackEnd.Repo.ProductRepo.deleteProductByProductName(..)) && args(productName)")

    public  void afterDeleteProductByProductName(JoinPoint joinPoint,String productName){
        LOGGER.info("After executing delete products by product name:"+joinPoint.getSignature().getName());

    }

}
