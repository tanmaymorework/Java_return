package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		
		// Syntax of an Array List 
		
		//ArrayList<Integer> list = new ArrayList<>();

		ArrayList<Integer> list = new ArrayList<>(2);  // 2 is an size of an constructor
		
//		list.add(21);       // Note  = we can add the infinte list in the ArrayList (Even if the size of the constructore is defined)
//		list.add(2431);
//		list.add(251);
//		list.add(24321);
//		list.add(2132);
//		list.add(21311);
//		list.add(431);
//		list.add(321);
		
//		System.out.println(list);
		
//		System.out.println(list.contains(21));  // check if the value is present or not  // Op =  true
		
	
//		list.set(1, 43);  // 1 is the index and 43 is the value to be replaced
//		System.out.println(list);
		
//		list.remove(3);  // It will remove the index of 3 value
//		System.out.println(list);
		
		// taking Inputs from users
		
		for(int i=0; i<5;i++) {
			list.add(sc.nextInt());
		}
		
		// Get iteam at any index
		for(int i=0; i<5; i++) {
			System.out.println(list.get(i));  // Passing index here, list[index] syntax will not work here
		}
		
	}

}
