// Searching and Printing an array of negetive element

package Arrays;

import java.util.Scanner;

public class Negetive {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Array Size");
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		System.out.println("Enter Array Elemnts");
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
			
}		
			// Printing negetive values
			for(int i=0; i<n; i++) {
				if(arr[i]<0) {
					System.out.println("Negetive Elemnts are " + arr[i] + " ");
				}
			}
	}

}
