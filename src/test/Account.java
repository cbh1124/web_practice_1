package test;

// ���¹�ȣ, ������, �ݾ�
public class Account {
	private String ago;
	private String owner;
	private int balance;
	
	public Account(String ago, String owner, int balance) {
		this.ago = ago;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAgo() {
		return ago;
	}

	public void setAgo(String ago) {
		this.ago = ago;
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
