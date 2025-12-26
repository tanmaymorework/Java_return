package Arrays;

public class MaxArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {21, 31,43,53};
		System.out.println(max(arr));

	}
	
	// Imagin that Array is not empty 
	 static void max(int[] arr) {
		 int maxval = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>maxval) {
				maxval = arr[i];
			}
			
		}
		return maxval;
	}

}
