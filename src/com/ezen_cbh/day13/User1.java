package com.ezen_cbh.day13;

public class User1 extends Thread {
	
	private Calculator calculator;
	
	public void setCaculator(Calculator calculator) {
		this.setName("user1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		
		calculator.setMemory(100);
	}

}
