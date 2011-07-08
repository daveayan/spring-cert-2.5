package learn.spring25.di.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanImplementingInterfaces implements InitializingBean, DisposableBean{
	public BeanImplementingInterfaces() {
		System.out.println("In BeanImplementingInterfaces::BeanImplementingInterfaces ");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("In BeanImplementingInterfaces::afterPropertiesSet ");
	}

	public void destroy() throws Exception {
		System.out.println("In BeanImplementingInterfaces::destroy");
	}
}