package com.capgemini.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testForTwoPositiveNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.multiply(4,6);
		assertEquals(24, actual,0);
	}
	

	@Test
	public void testForTwoNegativeNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.multiply(-4,-6);
		assertEquals(24, actual,0);
	}

	@Test
	public void testForOneNegativeNumber() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.multiply(-4,6);
		assertEquals(-24, actual,0);
	}
	
	@Test
	public void testForOneZeroNumber() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.multiply(0,6);
		assertEquals(0, actual,0);
	}
	
	@Test
	public void testForTwoZeros() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.multiply(0,0);
		assertEquals(0, actual,0);
	}
}
