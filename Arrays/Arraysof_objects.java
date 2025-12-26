package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Arraysof_objects {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 // Array of String 
		
		String [] str = new String [4];
		for(int i=0;i<str.length;i++) {
			str[i] = sc.next();
			
		}
		
		System.out.println(Arrays.toString(str));
		
		// Modifying 
		
		str[2] = "Tanmay";
		System.out.println(Arrays.toString(str));
		

	}

}
