package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(
		value = CommonJoinPointConfig.BUSINESS_LAYER,
		returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("afterReturning - {} returned with value {}", joinPoint, result);
	}

	@AfterThrowing(
		value = CommonJoinPointConfig.BUSINESS_LAYER,
		throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		logger.info("afterThrowing - {} returned with value {}", joinPoint, exception);
	}

	@After(value = CommonJoinPointConfig.BUSINESS_LAYER)
	public void after(JoinPoint joinPoint) {
		logger.info("after - {}", joinPoint);
	}

}