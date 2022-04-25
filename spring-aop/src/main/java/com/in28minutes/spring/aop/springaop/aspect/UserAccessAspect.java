package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect // aspect is a combination of point-cut and advice
@Configuration
public class UserAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// point-cut expression -> execution(* PACKAGE.*.*(..))
	// Weaving & Weaver
	@Before(CommonJoinPointConfig.DATA_LAYER)
	public void before(JoinPoint joinPoint) {
		// joint-point -> specific execution intercept
		// advice
		logger.info(" Check for user access ");
		logger.info(" Allowed execution for - {}", joinPoint);
	}
	
}