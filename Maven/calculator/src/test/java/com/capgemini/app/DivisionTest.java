package com.capgemini.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DivisionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testForFirstGreaterAndOtherSmallNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.divide(10,2);
		assertEquals(5, actual,0);
	}

	@Test
	public void testForFirstSmallerAndOtherGreaterNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.divide(10,20);
		assertEquals(0.5, actual,0);
	}
	

	@Test (expected = ArithmeticException.class)
	public void testForZeroDenominator() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();		
		arithmaticOperations.divide(10,0);		
	}
	

	@Test (expected = ArithmeticException.class)
	public void testForTwoZeros() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();		
		arithmaticOperations.divide(0,0);		
	}
	
	
	@Test
	public void testForZeroNumerator() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.divide(0,20);
		assertEquals(0, actual,0);
	}
	
}
