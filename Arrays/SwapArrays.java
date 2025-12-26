package Arrays;

import java.util.Arrays;

public class SwapArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 3, 6, 7, 9};
		
		swap(arr, index1:1, index2:3);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
