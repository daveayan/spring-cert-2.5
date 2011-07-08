package learn.spring25.aop.classicaop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class ValidationHandler implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		for(Object arg: args) {
			validateNotNull(arg);
		}
	}
	
	public void validateNotNull(Object obj) {
		if (obj == null) {
			throw new IllegalArgumentException("Object cannot be null");
		}
	}
}