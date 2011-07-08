package learn.spring25.aop.aopxml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class LoggingHandler {
	
	public void printEnterMessage(JoinPoint jp) {
		System.out.println("Enter " + jp.getTarget().getClass() + "." + jp.getSignature().getName() + Arrays.toString(jp.getArgs()));
	}
	
	public void printExitMessage(JoinPoint jp) {
		System.out.println("Exit  " + jp.getTarget().getClass() + "." + jp.getSignature().getName() + Arrays.toString(jp.getArgs()));
	}
}