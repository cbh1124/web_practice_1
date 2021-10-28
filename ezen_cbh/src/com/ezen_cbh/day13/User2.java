package com.ezen_cbh.day13;

public class User2 extends Thread{
	
	private Calculator calculator;
	
	public void setCaculator(Calculator calculator) {
		this.setName("user2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		
		calculator.setMemory(50);
	}
}
