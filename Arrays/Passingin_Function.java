// Notes = Arrays are mutable in java

package Arrays;

import java.util.Arrays;

public class Passingin_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {2,3,45,66};
		System.out.println(Arrays.toString(nums));
		
		change(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	static void change(int[]arr) {
		arr[0] = 99;
	}

}
