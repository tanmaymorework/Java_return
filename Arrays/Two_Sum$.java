// Given an array arr[] of positive integers and another integer target. Determine if there
//exist two distinct indices such that the sum of their elements is equal to the target

package Arrays;

public class Two_Sum$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println(twosum(arr, target));
		
	}
	
	static boolean twosum(int arr[], int target) {
			int n =arr.length;
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length;j++) {
					if(arr[i]+arr[j]==target)
						return true;
				}
			}
			return false;
		}


}


// Note = It is the bad code because of the time complexity is to big 