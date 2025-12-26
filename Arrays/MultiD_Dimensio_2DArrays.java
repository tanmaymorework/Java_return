package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiD_Dimensio_2DArrays {
	

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		/*
		  	1 2 3
		  	4 5 6 
		  	7 8 9
		 */
		
		// Syntax 
		
//		In 2D Array we take two [] []  (one for row and another for coloums
		
//		int[] [] arr = new int [3] [] ;  // First [] is for row mandatory to give value  & next [] is for coloums not mndatory to give the values 
		
		// OR
		
//		int [] [] arr2 = {
//			
//				{1, 2, 3},  // Basically this is the o index of an arr2
//				{4, 5, 6},  // This is an 1 index of an arr2
//				{7, 8, 9}, // This is an 3 index of an arr3
//			
//		};
//		
//		System.out.println(Arrays.toString(arr2[2]));  // op = [7, 8, 9]
		
		// Inputs
		
		int [] [] arr3 = new int [3] [3];
		System.out.println(arr3.length); // Lenght of an arrays
		
	//Note =  in 2D the length of an arr id "Row"
		
		for (int row = 0; row< arr3.length; row++) {
			
			// For each coloum 
			
			for(int col=0; col<arr3[row].length; col++) {
				arr3[row] [col] = sc.nextInt();
			}
		}
		
		// Output
		
//for (int row = 0; row< arr3.length; row++) {
//			
//			// For each coloum 
//			
//			for(int col=0; col<arr3[row].length; col++) {
//				System.out.print(arr3[row][col] + " ");
//			}
//			System.out.println();
//		}
		 
		
		// OR output in arrays to string 
		
		for(int row=0; row<arr3.length; row++) {
			System.out.println(Arrays.toString(arr3[row]));
		}
		
	}

}
