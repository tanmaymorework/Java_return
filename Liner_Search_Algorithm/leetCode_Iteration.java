// find the most bank account have and print the Richest customer wealth



package Linear_SearchAlgoritham;

public class leetCode_Iteration {

	public static void main(String[] args) {
		
	}
	public int maxWealth (int [] [] accounts) {
		// perrson  =row  & account = coloums
		int ans = Integer.MIN_VALUE;
		for(int person =0; person<accounts.length; person++) {
			
			// When u start a new coloum , take a new sum in that row
			int sum =0;;
			for(int account =0; account <accounts[person].length; account++) {
				sum += accounts[person][account];
			}
			
			// now we have sum of accounts of person 
			// Check with overall ans 
			
			if(sum>ans) {
				ans = sum;
			}
		}
		return ans;
	}

}
