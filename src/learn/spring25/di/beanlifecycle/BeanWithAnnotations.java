package learn.spring25.di.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SuppressWarnings("restriction")
public class BeanWithAnnotations {
	public BeanWithAnnotations() {
		System.out.println("In BeanWithAnnotations::BeanWithAnnotations " + this);
	}
	
	@PostConstruct
	public void onStartUp() {
		System.out.println("In BeanWithAnnotations::onStartUp");
	}
	
	@PreDestroy
	public void onShutDown() {
		System.out.println("In BeanWithAnnotations::onShutDown");
	}
}