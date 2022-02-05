import java.util.Arrays;
import java.util.Scanner;


public class BigandSmallNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers will you enter? ");
		int n = input.nextInt();
	    final int k = n;
		int[] b = new int[k];
		
		while(n > 0) {
			System.out.print("Please enter numbers :");
			int number = input.nextInt();
			for(int i = 0; i < n; i++) {
				b[i] = number;
			}	
			n--;
		}
		Arrays.sort(b);
		System.out.println("Entered numbers : "+ Arrays.toString(b));
		System.out.println("Biggest number: "+ b[k-1]);
		System.out.println("Smallest number: "+ b[0]);
		
		
	}

}
