package com.organization.abstarction;

public  abstract class Parent {
	
	int age;
	String name;
	
	public Parent() {
		super();
		System.out.println("Inside parent no arg constructor");
	}
	
	public Parent(int age, String nm) {
		super();
		this.age = age;
		this.name = nm;
		System.out.println("Inside Parent all arg constructor");
	}
	
	public abstract void printHi();
	
	public void printHello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}
	}
	
	
