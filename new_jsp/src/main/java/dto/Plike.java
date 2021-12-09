package dto;

public class Plike {
	private int p_like_num;
	private int p_num;
	private int m_num;
	
	public Plike() {
		// TODO Auto-generated constructor stub
	}

	public Plike(int p_like_num, int p_num, int m_num) {
		
		this.p_like_num = p_like_num;
		this.p_num = p_num;
		this.m_num = m_num;
	}
	
	

	public Plike(int p_num, int m_num) {
		
		this.p_num = p_num;
		this.m_num = m_num;
	}

	public int getP_like_num() {
		return p_like_num;
	}

	public void setP_like_num(int p_like_num) {
		this.p_like_num = p_like_num;
	}

	public int getP_num() {
		return p_num;
	}

	public void setP_num(int p_num) {
		this.p_num = p_num;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	
}
