package com.usa.constuctor;

public class Constructor {
	
	Constructor(String name){
		System.out.println(name);
	}

	Constructor(int salary){
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor("Saikot");
		Constructor obj2 = new Constructor("5000");
	}
}
