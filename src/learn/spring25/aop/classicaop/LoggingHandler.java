package learn.spring25.aop.classicaop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class LoggingHandler implements MethodBeforeAdvice, AfterReturningAdvice {
	public void before(Method method, Object[] args, Object arg2)
			throws Throwable {
		System.out.println("Enter " + method.getName() + Arrays.toString(args));
	}

	public void afterReturning(Object arg0, Method method, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("Exit  " + method.getName());
	}
}