package com.spring.aop.springaop.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class UserAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	//Pointcut
	@Before("execution(* com.spring.aop.springaop.dao.*.*(..))")
	public void before(JoinPoint joinPoint){
		//Advice
		logger.info(" Check for user access ");
		logger.info(" Allowed execution for {}", joinPoint);
	}
}