package learn.spring25.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ValidationHandler implements InvocationHandler {

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		for(Object arg: args) {
			validateNotNull(arg);
		}		
		return method.invoke(target, args);
	}
	
	public void validateNotNull(Object obj) {
		if (obj == null) {
			throw new IllegalArgumentException("Object cannot be null");
		}
	}
	
	public static Object createProxy(Object target) {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), new ValidationHandler(target));
	}
	
	public ValidationHandler(Object t) {
		target = t;
	}
	
	private Object target;
}