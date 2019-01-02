package com.formation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private static Calculator calculator = new Calculator();
	
	@Before
	public void clearScreen() {
		calculator.clear();
	}
	
	@Test
	public void addTest() {
		calculator.enter(5);
		calculator.add(10);
		assertEquals(calculator.getScreenResult(), 15);
	}
	
	@Test
	public void substractTest() {
		calculator.enter(10);
		calculator.substract(5);
		assertEquals(calculator.getScreenResult(), 5);
	}
	
	@Test
	public void multiplyTest() {
		calculator.enter(10);
		calculator.multiply(5);
		assertEquals(calculator.getScreenResult(), 50);
	}
	
	@Test
	public void divideTest() {
		calculator.enter(50);
		calculator.divide(5);
		assertEquals(calculator.getScreenResult(),10);
	}

}
