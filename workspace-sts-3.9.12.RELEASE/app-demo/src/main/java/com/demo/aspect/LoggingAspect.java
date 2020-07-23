package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	//@Before("execution(public String getName())")
	//@Before("execution(public String com.demo.model.Triangle.getName())")
	//@Before("execution(public * get*())")
	//@Before("execution(public String com.demo.molde.Circle.getName())")
	//@Pointcut("execution(public * get*())")
	//@Pointcut("execution(* com.demo.model.*.*(..))")
	//@Pointcut("execution(publidc * get*())")
	//@Pointcut("within(com.demo.model.Circle)")
	//@Before("anotherAdvice() || adviceForOtherGetter()")
	
	//@Before("execution(public String getName())")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("Advice for getter method!" + joinPoint.getTarget());
		
	}
	//@Before("args(String")
	//@Before("args(tempName)")
	public void stringArgMethods(String tempName) {
		System.out.println("Advice when String ARG method is called." + tempName);
	}
	//@AfterReturning("args(returnVal)")
	//@AfterReturning()
	public void stringReturnAdvice(String returnVal) {
		System.out.println("Advice when STRING is returned!" + returnVal);
	}
	
	//@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void adviceForException(String name, RuntimeException ex) {
		System.out.println("This was the ARG: " + name);
		System.out.println("An exception occured" + ex);
		
	}
	
	//@Pointcut("execution(* *(..))")
	public void anotherAdvice() {
		
	} 
	//@Pointcut("within(com.demo.service..*)")
	//@Pointcut("execution(public String com.demo.model.Circle.getName())")
	public void adviceForOtherGetter() {
		
	}
	//@Around("execution(public String com.demo.model.Circle.getName())")
	@Around("@annotation(com.demo.customeradvice.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object object = null;
		try {
			System.out.println("Beofre Advice");
			
			object = proceedingJoinPoint.proceed();
			System.out.println("After Advice.");
			
			
			System.out.println("Returned val " + object);
			//throw(new RuntimeException());
			
		} catch (Throwable e) {
			System.out.println("An Exception caught");
			e.printStackTrace();
		}
		return object;
	}
	
	
}
