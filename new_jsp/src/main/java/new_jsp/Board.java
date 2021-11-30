package new_jsp;

public class Board {
	
	// 1. 필드 
	private String title;
	private String content;
	private String write;
	
	// 2.  생성자
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(String title, String content, String write) {
		
		this.title = title;
		this.content = content;
		this.write = write;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWrite() {
		return write;
	}

	public void setWrite(String write) {
		this.write = write;
	}

	
	
	
	
	
	
	
}
