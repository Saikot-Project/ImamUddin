package com.usa.polymorphism;

public class MethodOverridingB extends MethodOverridingA{
	//public void getName() {
	//	System.out.println("My First name is Saikot");
	//}


	public static void main(String[] args) {
		MethodOverridingB obj = new MethodOverridingB();
		obj.getName();
	}
}
