package learn.spring25;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class GlobalLoggingHandler {

	public void printEnterMessage(JoinPoint jp) {
		System.out.println("Enter " + jp.getTarget().getClass().getName() + "."
				+ jp.getSignature().getName() + Arrays.toString(jp.getArgs()));
	}

	public void printExitMessage(JoinPoint jp) {
		System.out.println("Exit  " + jp.getTarget().getClass().getName() + "."
				+ jp.getSignature().getName() + Arrays.toString(jp.getArgs()));
	}
}