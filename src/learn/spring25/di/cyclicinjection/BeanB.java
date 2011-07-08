package learn.spring25.di.cyclicinjection;

public class BeanB {
	public BeanB() {
		System.out.println("In BeanB::BeanB " + this);
	}
	
	public void setBeanA(BeanA beanA) {
		System.out.println("In BeanB::setBeanA " + this + " : " + beanA);
		this.beanA = beanA;
	}
	
	private BeanA beanA;
}