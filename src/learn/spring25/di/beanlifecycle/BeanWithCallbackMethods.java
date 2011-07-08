package learn.spring25.di.beanlifecycle;

public class BeanWithCallbackMethods {
	public BeanWithCallbackMethods() {
		System.out.println("In BeanWithCallbackMethods::BeanWithCallbackMethods");
	}
	
	public void onStartUp() {
		System.out.println("In BeanWithCallbackMethods::onStartUp");
	}
	
	public void onShutDown() {
		System.out.println("In BeanWithCallbackMethods::onShutDown");
	}
}