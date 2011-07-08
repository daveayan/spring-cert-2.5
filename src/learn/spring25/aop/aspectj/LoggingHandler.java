package learn.spring25.aop.aspectj;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingHandler {
	
	@Before("execution (* *(..))")
	public void printEnterMessage(JoinPoint jp) {
		System.out.println("Enter " + jp.getTarget().getClass() + "." + jp.getSignature().getName() + Arrays.toString(jp.getArgs()));
	}
	
	@After("execution (* *(..))")
	public void printExitMessage(JoinPoint jp) {
		System.out.println("Exit  " + jp.getTarget().getClass() + "." + jp.getSignature().getName() + Arrays.toString(jp.getArgs()));
	}
}