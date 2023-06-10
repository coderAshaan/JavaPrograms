package com.abbie.inheritance;

public class Child extends Parents {
	
	public void sub () {
		int d = a - b;
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child newChildObj = new Child();
		newChildObj.sub();
		newChildObj.display();

	}

}
