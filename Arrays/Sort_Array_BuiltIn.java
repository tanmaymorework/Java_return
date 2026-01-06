package Arrays;
import java.util.Arrays;

public class Sort_Array_BuiltIn {

	
	public static void main(String[] args) {
		int [] arr = {2,-3,45,-6,7,56,764};
		tan(arr);
		Arrays.sort(arr); // Use to sort the arrays
		tan(arr);
		
	}
	
	public static void tan(int [] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
