// Search for 3 in the range of index [1 to 4]


package Linear_SearchAlgoritham;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {18, 12, -7, 3, 14, 28};
		int target = 3;
		int start;
		int end;
		System.out.println(LinerSearch(arr, target, 1, 4));  // 1 = start, 4 = end

	}
	
	static  int LinerSearch(int[] arr, int target , int start , int end) {
		if(arr.length == 0) {
			return  -1;
		}
		
		// run the loop 
		for(int index = start; index <= end; index++) {
			// Check for element for every index if it is = target
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		return -1;
	}
}
