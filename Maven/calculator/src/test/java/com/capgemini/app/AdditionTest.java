package com.capgemini.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testForTwoPositiveNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.add(4,5);
		assertEquals(9, actual,0);		
	}
	
	@Test
	public void testForTwoNegativeNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.add(-4,-5);
		assertEquals(-9, actual,0);
	}
	
	@Test
	public void testForOneNegativeNumber() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.add(-4,5);
		assertEquals(1, actual,0);
	}

	@Test
	public void testForOneZeroNumber() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.add(0,5);
		assertEquals(5, actual,0);
	}
	
	@Test
	public void testForTwoZeroNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.add(0,0);
		assertEquals(0, actual,0);
	}
	
	@Test
	public void testForTwoSameNumbers() {
		ArithmaticOperations arithmaticOperations=new ArithmaticOperations();
		double actual=arithmaticOperations.add(5,5);
		assertEquals(10, actual,0);
	}
	
	
	
}
