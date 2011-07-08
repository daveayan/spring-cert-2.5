package learn.spring25;

public class Entity {
	public String toString() {
		return "Entity Id : " + id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Entity() {
		id = 0;
	}
	
	private int id;
}
