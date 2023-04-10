package com.usa.abstraction;

public class AbstractRegularClass extends AbstractionA {
	
	@Override
	public void getAbstract() {
		
		System.out.println("I am the abstract method");
	}
	public static void main(String[] args) {
		AbstractRegularClass obj = new AbstractRegularClass();
		obj.getAbstract();
		obj.getName();
		obj.getSalary();
		obj.getTesla();
	}
	
}
