package com.formation;

public class Calculator {
	
	private int screenResult = 0;
	
	public void clear() {
		screenResult = 0;
	}
	
	public void enter(int i) {
		screenResult = i;
	}
	
	public void add(int i) {
		screenResult = screenResult + i;
	}
	
	public void substract(int i) {
		screenResult = screenResult - i;
	}
	
	public void multiply(int i) {
		screenResult = screenResult * i;
	}
	
	public void divide(int i) {
		screenResult = screenResult / i;
	}

	public int getScreenResult() {
		return screenResult;
	}

}
