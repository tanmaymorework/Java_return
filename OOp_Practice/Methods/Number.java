
//Q3 = Create a class Number with method square(int n) that prints square of a number.

package com.methods;

public class Number {
	
	void square(int n) {
		System.out.println("Square of the Number "+n+" is "+ (n*n));
	}
	
	public static void main(String[] args) {
		
		
		int n = 2;
		
		Number num = new Number();
		num.square(n);
		
	}

}
