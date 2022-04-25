package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.in28minutes.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}

	public final static String DATA_LAYER =
			"com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()";

	@Pointcut("within(com.in28minutes.spring.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {}

	public final static String DATA_LAYER_WITHIN =
			"com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecutionWithWithin()";

	@Pointcut("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	public final static String BUSINESS_LAYER =
			"com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()";

	@Pointcut("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() "
			+ "&& com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void allLayerExecution() {}
	
	public final static String ALL_LAYER =
			"com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.allLayerExecution()";

	@Pointcut("bean(Dao*)")
	public void beanStartingWithDao() {}
	
	public final static String BEAN_STARTING_WITH_DAO =
			"com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.beanStartingWithDao()";

	@Pointcut("bean(*Dao)")
	public void beanEndingWithDao() {}
	
	public final static String BEAN_ENDING_WITH_DAO =
			"com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.beanEndingWithDao()";

	@Pointcut("bean(*Dao*)")
	public void beanContainingDao() {}
	
	public final static String BEAN_CONTAINING_DAO =
			"com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.beanContainingDao()";

	@Pointcut("@annotation(com.in28minutes.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
	
	public final static String TRACKTIME_ANNO =
			"com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()";
}