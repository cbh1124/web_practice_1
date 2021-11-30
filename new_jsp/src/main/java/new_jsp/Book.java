package new_jsp;

public class Book {
	private String b_ISBN;
	private String b_name;
	private String m_id;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String b_ISBN, String b_name, boolean b_rental, String m_id) {
		
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.m_id = m_id;
	}

	public String getB_ISBN() {
		return b_ISBN;
	}

	public void setB_ISBN(String b_ISBN) {
		this.b_ISBN = b_ISBN;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}


	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	
	
	
	
}
