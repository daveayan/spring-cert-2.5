package learn.spring25;

import java.io.Serializable;

public class Document extends Entity implements Serializable {
	
	public Document(DocumentContent content) {
		System.out.println("In public Document((DocumentContent) " + content + ")");
		this.content = content;
	}
	
	public Document(String name) {
		System.out.println("In public Document(" + name + ")");
		this.name = name;
	}
	
	public Document(int size) {
		System.out.println("In public Document(" + size + ")");
		this.size = size;
	}
	
	public Document(String name, int size, boolean deleted) {
		System.out.println("In public Document(" + name + ", " + size + ", " + deleted + ")");
		this.name = name;
		this.size = size;
		this.deleted = deleted;
	}
	
	public Document() {
		System.out.println("In public Document()");
		name = "N.A.";
	}
	
	public String toString() {
		return "\n" + super.toString() + ", Document : " + name + ", Size : " + size + ", deleted : " + deleted + ", content : " + content;
	}
	
	private String name;
	private int size;
	private boolean deleted;
	private DocumentContent content;
	private static final long serialVersionUID = 7822534079075982493L;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public DocumentContent getContent() {
		return content;
	}

	public void setContent(DocumentContent content) {
		this.content = content;
	}	
}