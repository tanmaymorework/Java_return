//Q7 = Create a class Employee with instance variables and display details.

package com.methods;


public class Employe {
	
	int id;
	String name;
	String status;
	
	void setData(int i, String n, String s) {
		id = i;
		name = n;
		status =s;
		
	}
	
	void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Status: " +status);
    }
	
	public static void main(String[] args) {
		
		Employe e = new Employe();
		
		e.setData(21, "Tanmay", "Unemploye");
		e.display();
		
		
		
	}

}
