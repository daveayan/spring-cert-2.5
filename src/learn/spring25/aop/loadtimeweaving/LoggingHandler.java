package learn.spring25.aop.loadtimeweaving;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.springframework.util.StopWatch;

public class LoggingHandler {

	public void printEnterMessage(JoinPoint jp) {
		sw = new StopWatch(jp.getTarget().getClass().getSimpleName());
		System.out.println("Enter " + jp.getTarget().getClass().getSimpleName()
				+ "." + jp.getSignature().getName()
				+ Arrays.toString(jp.getArgs()));
	}

	public void printExitMessage(JoinPoint jp) {
		sw.stop();
		System.out.println("Exit  " + jp.getTarget().getClass().getSimpleName()
				+ "." + jp.getSignature().getName()
				+ Arrays.toString(jp.getArgs()) + sw.prettyPrint());
	}

	StopWatch sw;
}