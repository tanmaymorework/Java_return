/*Create a class Rectangle with methods:

setValues(int l, int b)

area() 

*/

package com.methods;

public class Rectangle {
	
	int length,breadth;
	
	void setValue(int l, int b) {
		
		length = l;
		breadth = b;
		
	}
	
	void area() {
		System.out.println("Area : "+ (length*breadth));
	}
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.setValue(10, 5);
		r.area();
		
	}

}
