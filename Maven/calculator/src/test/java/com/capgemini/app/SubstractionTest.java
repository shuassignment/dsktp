package com.capgemini.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SubstractionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testForTwoPositiveNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.substract(4,3);
		assertEquals(1, actual,0);
	}


	@Test
	public void testForTwoNegativeNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.substract(-4,-3);
		assertEquals(-1, actual,0);
	}

	@Test
	public void testForOneNegativeNumber() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.substract(4,-3);
		assertEquals(7, actual,0);
	}

	@Test
	public void testForTwoZeros() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.substract(0,0);
		assertEquals(0, actual,0);
	}

	@Test
	public void testForOneZeroNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.substract(4,0);
		assertEquals(4, actual,0);
	}

	@Test
	public void testForTwoSameNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.substract(4,4);
		assertEquals(0, actual,0);
	}
	
}
