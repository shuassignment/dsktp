package com.cg.app.aspect;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {

	Logger logger=Logger.getLogger(ValidationAspect.class);
	
	@Before("execution(* com.cg.app.service.Calculator.*(..))") 
	public void log1() {	
		BasicConfigurator.configure();
		logger.info("@Before : Before - Logging the method");		
	}
	
	@After("execution(* com.cg.app.service.Calculator.*(..))")
	public void log2() {
		logger.info("@After : After- Logging the method");
	}
	
	@Around("execution(* com.cg.app.service.Calculator.add(..))")
	public void log3(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		logger.info("@Around : Before- Logging the method");
		proceedingJoinPoint.proceed();
		logger.info("@Around : After- Logging the method");
	}
	
	@AfterReturning(pointcut="execution(* com.cg.app.service.Calculator.sub(..))",returning="retVal")
	public void log4(Integer retVal) {
		logger.info("returned value : "+retVal);
	}
	
	@AfterThrowing(pointcut="execution(* com.cg.app.service.Calculator.exception(..))",throwing="error")
	public void log5(JoinPoint jp,Throwable error) {
		logger.error("@AfterThrowing : "+error);
		 System.out.println("Method Signature: "  + jp.getSignature());  
		   System.out.println("Exception: "+error);  
	}
}
