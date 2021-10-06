package com.ezen_cbh.day6;

public class Account {
	// 1. 필드 [ private : 필드 보호를 위한 접근제한자 ]
		// 현재 클래스내에서만 사용 가능 
		// 외부로 접근불가 [ 간접접근 : get, set 메소드 ] 
	private String ano;
	private String owner;
	private int balance;
	
	// 2. 생성자 // 자동완성 : 마우스 오른쪽 클릭 => source
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 3. 메소드 // 자동완성 
	public String getAno() {return ano; } // 
	public void setAno(String ano) {this.ano = ano; }
	public String getOwner() {return owner; }
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) { this.balance = balance;} 
}
