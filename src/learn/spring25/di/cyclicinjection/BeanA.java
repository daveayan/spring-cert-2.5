package learn.spring25.di.cyclicinjection;

public class BeanA {
	public BeanA() {
		System.out.println("In BeanA::BeanA " + this);
	}
	
	public void setBeanB(BeanB beanB) {
		System.out.println("In BeanA::setBeanB " + this + " : " + beanB);
		this.beanB = beanB;
	}
	
	private BeanB beanB;
}