package com.abbie.accessmodifier;

import javax.swing.DefaultBoundedRangeModel;

public class ClassA {

	private int a = 10;
	protected char b = 'z';
	 int d = 0;
	
	public void display() {
		System.out.println();
	}
	
	public static void main(String args[]) {
		ClassA ob = new ClassA();
		System.out.println(ob.a);
	}
}
