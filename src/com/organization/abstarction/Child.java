package com.organization.abstarction;

public class Child  extends Parent {
	
	public Child() {
		super();
		System.out.println("Inside child no arg constructor");
	}
	
	public Child(int age, String name) {
		super(age, name);
		System.out.println("Inside child all arg constructor");	
	}
	
	public void printHi() {
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		System.out.println(c.age);
		System.out.println(c.name);
		
		c.printHi();
		c.printHello();
	
		Child c1 = new Child(25, "Sneha");
		
		System.out.println(c1.age);
		System.out.println(c1.name);
		
		c1.printHello();
		c1.printHi();
	}
	
}
