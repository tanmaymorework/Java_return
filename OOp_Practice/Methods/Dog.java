// Create two objects of class Dog and call bark() method.

package com.methods;

public class Dog {
	
	void bark() {
		System.out.println("Dog is Barking");
	}
	
	public static void main(String[] args) {
		
		Dog d1  = new Dog();
		Dog d2 = new Dog();
		
		d1.bark();
		d2.bark();
	}

}
