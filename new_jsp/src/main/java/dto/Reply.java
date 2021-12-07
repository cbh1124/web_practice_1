package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reply {
	private int r_num;
	private String r_contents;
	private String r_date;
	private int m_num;
	private int b_num;
	
	public Reply() {}
	public Reply(int r_num, String r_contents, String r_date, int m_num, int b_num) {
		
		this.r_num = r_num;
		this.r_contents = r_contents;
		
		Date today = new Date();
		
		SimpleDateFormat datetimeformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm");
		try {
			Date date =  datetimeformat.parse( r_date );	// [문자열]DB -> 날자형 변환
	
			if( dateFormat.format( date ).equals(  dateFormat.format( today ) ) ) {
				
				this.r_date = timeformat.format(date);
				
			}else {
				this.r_date = dateFormat.format(date);
				
			}
		}
		catch (Exception e) {}
	
		
		this.m_num = m_num;
		this.b_num = b_num;
	}
	

	public Reply(String r_contents, int m_num, int b_num) {
		
		this.r_contents = r_contents;
		
		this.m_num = m_num;
		this.b_num = b_num;
		
	}


	public int getR_num() {
		return r_num;
	}

	public void setR_num(int r_num) {
		this.r_num = r_num;
	}

	public String getR_contents() {
		return r_contents;
	}

	public void setR_contents(String r_contents) {
		this.r_contents = r_contents;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public int getB_num() {
		return b_num;
	}

	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	
	
	
	
	
	
}
