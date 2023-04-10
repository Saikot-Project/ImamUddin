package com.usa.inheritance;

public class InterfaceRegularClass implements InterfaceA, InterfaceB {

	public void getJob() {
		System.out.println("Saikot need IT job");
	}
	
	public void getPropertiesB() {
		// TODO Auto-generated method stub
		System.out.println("I am from interface B");
	}

	public void getPropertiesA() {
		// TODO Auto-generated method stub
		System.out.println("I am from interface A");
	}
public static void main(String[] args) {
	InterfaceRegularClass obj = new InterfaceRegularClass();
	obj.getPropertiesA();
	obj.getPropertiesB();
	obj.getJob();
	}

}
