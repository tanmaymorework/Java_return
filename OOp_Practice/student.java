/* Creating Objects:
 * 
ClassName objectName = new ClassName();

ClassName objectName; — Declares a reference variable objectName of type ClassName.
new ClassName(); — Creates a new object of ClassName by allocating memory and calling its constructor.
= — Assigns the reference (address) of the newly created object to the variable objectName.
So overall: objectName now holds a reference to a new ClassName object in memory.
2. Access Methods using Objects:

*/


// Q1 = Q1. Create a class Student with method display() that prints "Hello Student". Create an object and call the method.

package com.methods;

public class student {
	
	public void disply() {
		System.out.println("Hello student");
	}
	
	public static void main(String[] args) {
		
		student std = new student();
		
		std.disply();
		
		
	}

}
