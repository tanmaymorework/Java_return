// Multiplya odd index element by 2 and add 10 to the even index elements

package Arrays;

public class Odd_even_multiplicationAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {21 , 3 , 4 , 75 , 8};
		print (arr);
		
		for(int i =0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]*=2);
			}
			else{
				System.out.println(arr[i]+=10);
			}
		}
	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println("After Updation ");
		
	}

}
