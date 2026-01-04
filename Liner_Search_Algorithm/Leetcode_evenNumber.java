/*
 Gie an Array nnums of an Integer, return how many of them contain an Even Number of digits 
 */


package Linear_SearchAlgoritham;

public class Leetcode_evenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {12, 345, 2, 6, 7896};
		
		// to find the elemnst present in the array which is ODD
		System.out.println(findNumbers(nums));
		
		
		// To find number of digits 
		System.out.println(digits(32145));
	}
	
	static int findNumbers(int[]nums) {
		int count = 0;
		for(int num : nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}

	
	// function to check wheter a number contain even digits or not 
	static boolean even(int num) {
		int numberOfDigits = digits(num);
//		if(numberOfDigits % 2 == 0) {
//			return true;
//		}
//		return false;
		
		// OR
		
		return numberOfDigits % 2==0;
		
	}

	
	// Count number off digits in a number 
	static int  digits(int num) {
		if(num<0) {
			num = num *-1;
		}
		
		if(num == 0) {
			return 1;
		}
		
		int count =0;
		while(num>0) {
			count++;
			num = num/10;  // OR num/=10
		}
		return count;
	}
}



			// Important 

// Another method to print the digits in it essay method
/*
static int digits2(int num) {
	if(num < 0) {
		num = num *-1;
	}
	return (int)(Math.log10(num)) +1;
}
*/

