package learn.spring25.di.propertyfiles;

public class BeanA {
	private String name;
	private int age;
	private boolean active;
	
	public String toString() {
		return "name : " + name + ", age : " + age + ", active : " + active;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}