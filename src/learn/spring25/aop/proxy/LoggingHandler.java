package learn.spring25.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class LoggingHandler implements InvocationHandler {

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Enter " + method.getName() + Arrays.toString(args));
		Object result = method.invoke(target, args);
		System.out.println("Exit  " + method.getName());
		return result;
	}
	
	public static Object createProxy(Object target) {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), new LoggingHandler(target));
	}
	
	public LoggingHandler(Object t) {
		target = t;
	}
	
	private Object target;
}