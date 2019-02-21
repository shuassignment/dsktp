package com.cg.app.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	public Integer sub(Integer num1,Integer num2) {
		return num1-num2;
	}
	public void exception(){
		throw new IllegalArgumentException();
	}
}
