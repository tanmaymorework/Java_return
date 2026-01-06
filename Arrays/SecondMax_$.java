// Print the Second maximum element in the array

package Arrays;

public class SecondMax_$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,32,42,32,13,31};
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max2 && arr[i]!=max) {
					max2 = arr[i];
				}
				
			}
			System.out.println("Maximun Number is "+max);
			System.out.println("Second Max Number is "+max2);
		}
	}
	
