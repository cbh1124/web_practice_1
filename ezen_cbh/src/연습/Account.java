package 연습;

public class Account {
	// 1.필드 2. 생성자 3. 메소드 
	
	// 1. 필드
	private String ano; // 계좌번호 
	private String owner; // 예금주
	private int balance; // 금액 
	
	// 2. 생성자
	public Account(String ano, String owner, int balance) {
		
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	// 3. 메소드
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

	
	
}
