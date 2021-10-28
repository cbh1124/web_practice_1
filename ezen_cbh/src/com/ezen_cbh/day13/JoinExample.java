package com.ezen_cbh.day13;

public class JoinExample extends Thread {
	
	private long sum;
	
	public long getSum() { return sum; }
	
	public void setSum(long sum) { this.sum = sum;}
	
	@Override
	public void run() {
		
		for (int i = 1; i<=100; i++) {
			sum+= i;
		}
	}
}
