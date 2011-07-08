package learn.spring25.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ValidationHandler {
	
	@Before("execution (* *(..))")
	public void validateArgs(JoinPoint jp)
			throws Throwable {
		for (Object arg : jp.getArgs()) {
			validateNotNull(arg);
		}
	}

	public void validateNotNull(Object obj) {
		if (obj == null) {
			throw new IllegalArgumentException("Object cannot be null");
		}
	}
}
