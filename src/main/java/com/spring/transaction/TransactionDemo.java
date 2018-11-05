package com.spring.transaction;

import org.aspectj.lang.ProceedingJoinPoint;

public class TransactionDemo {

    public void beforeTransaction(){
        System.out.println("before transaction");
    }

    public void afterTransaction(){
        System.out.println("after transaction");
    }

    public void aroundTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("begin transaction");
        joinPoint.proceed();
        System.out.println("commit transaction");
    }
}
