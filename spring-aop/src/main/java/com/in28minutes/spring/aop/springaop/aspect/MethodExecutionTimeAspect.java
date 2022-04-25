package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionTimeAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// this method is executed by any method annotated with Tracktime
	@Around(CommonJoinPointConfig.TRACKTIME_ANNO)
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time Taken by {} is {}", joinPoint, timeTaken);
	}
	
}