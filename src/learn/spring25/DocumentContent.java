package learn.spring25;

public class DocumentContent {
	
	public DocumentContent() {
		super();
		System.out.println("In public DocumentContent()");
		this.content = "N.A.";
	}
	
	public DocumentContent(String content) {
		super();
		System.out.println("In public DocumentContent(" + content + ")");
		this.content = content;
	}
	
	public String toString() {
		return content;
	}

	private String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}