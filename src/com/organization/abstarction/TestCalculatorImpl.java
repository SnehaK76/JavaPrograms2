package com.organization.abstarction;

public class TestCalculatorImpl {
	public static void main(String[] args) {
		
		CalculatorImpl obj = new CalculatorImpl();
		
		System.out.println(" Addition is :"+obj.addition(30, 20));
		System.out.println(" Substrction is :"+obj.substrction(30, 20));
		System.out.println(" Multiplication is :"+obj.multiplication(30, 20));
		System.out.println(" Division is :"+obj.division(55, 20));
	}
}
