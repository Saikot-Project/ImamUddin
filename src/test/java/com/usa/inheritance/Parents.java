package com.usa.inheritance;

public class Parents extends GrandParent{

	
	public void getMarried() {
		System.out.println("Saikot get married");
	}
	
	
	public static void main(String[] args) {
		
	Parents obj = new Parents();
	obj.getMarried();
	obj.getGrandParentProperties();
	}
}
