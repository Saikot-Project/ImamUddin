package com.usa.inheritance;

public class ChildClass extends Parents {

	
	
	public void getCar() {
		System.out.println("Child Property => Saikot has a car 2023 model BMW");
	}
	
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.getCar();
		obj.getMarried();
		obj.getGrandParentProperties();
		
	}
}
