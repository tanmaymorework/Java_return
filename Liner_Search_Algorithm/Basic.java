//Q   Search the array if it is present or not
	// If not present then print -1



package Linear_SearchAlgoritham;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {21, 23, 42, 542, 643, 24};
		int target = 4232;
		int ans = LinerSearch(num, target);
		System.out.println(ans);
		
	}
	// Search the array if it is present or not
	// If not present then print -1
		static  int LinerSearch(int[] arr, int target) {
			if(arr.length == 0) {
				return  -1;
			}
			
			// run the loop 
			for(int index = 0; index < arr.length; index++) {
				// Check for element for every index if it is = target
				int element = arr[index];
				if(element == target) {
					return index;
				}
			}
			return -1;
		}
}
