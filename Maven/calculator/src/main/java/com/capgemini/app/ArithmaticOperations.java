package com.capgemini.app;

/**
 * @author Shubham Raut
 * 
 * This class performs arithmatic opeations 
 *
 */
public class ArithmaticOperations {

	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	public double add(double number1, double number2) {
		return number1+number2;
	}

	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	public double substract(double number1, double number2) {
		return number1-number2;
	}

	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	public double multiply(double number1, double number2) {
		return number1*number2;
	}

	/**
	 * @param numerator
	 * @param denominator
	 * @return
	 * @throws ArithmeticException
	 */
	public double divide(double numerator, double denominator) throws ArithmeticException {
		if(denominator==0)
			throw new ArithmeticException();
		return numerator/denominator;
	}

}
