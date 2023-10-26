package com.organization.abstarction;

public class B extends A{
	public static void main(String[] args) {
		
		B b = new B();			
		b.printHello();
		b.printHi();
		b.addition(23, 87);
		
		
	}
	
	public void printHi() {
		System.out.println("Hii");
		System.out.println("Hii");
		System.out.println("Hii");
		System.out.println("Hii");
		System.out.println("Hii");
	}
	
	public void addition(int num1, int num2) {
		int result = num1 + num2;
		
		System.out.println("Result is:" +result);
	}
}
