package learn.spring25.aop.aopxml;

import org.aspectj.lang.JoinPoint;

public class ValidationHandler {
	
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
