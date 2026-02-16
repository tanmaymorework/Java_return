// Q4 = Create a class Message with method greet(String name).

package com.methods;

public class Message {
	
	void greet(String name) {
		
		System.out.println("Boss is "+name);
		
	}
	
	public static void main(String[] args) {
		
		Message msg = new Message();
		//String name = "Tanmay";
		msg.greet("Tanmay");
	}

}
