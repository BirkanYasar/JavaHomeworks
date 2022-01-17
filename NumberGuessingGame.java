import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

		Random rand = new Random();	
		int number = rand.nextInt(100); 
		
		Scanner input = new Scanner(System.in);
		int right = 0;
		int k = 0;
		int[] answer = new int[5];			
			
		while(right < 5) {
			System.out.print("Please enter your number guess:: ");
			int guess = input.nextInt();
			
			if(guess < 0 || guess > 99) {
			System.out.println("The number you entered is invalid, please enter a value between 0-100!");
			answer[k++] = guess;
			continue;
			}
			if(guess == number) {
				System.out.println("Congrats on the correct guess! ");
				System.out.println("The Answer is : " + number);
				break; 
			}
			if(right == 4) {
				answer[k++] = guess;
				System.out.println("You lost the game ");
				System.out.println("Your guesses : " + Arrays.toString(answer));
				break;
			}
			if(guess > number) {
				System.out.println("Wrong guess. The number you entered is greater than the hidden number..");
				answer[k++] = guess;
				right++;
				System.out.println("Your remaining guess:  "+ (5 - right));				
			}else {
				System.out.println("Wrong guess. The number you entered is less than the hidden number.");
				answer[k++] = guess;
				right++;
				System.out.println("Your remaining guess: "+ (5 - right));
				continue;
				}

		}
		
	}

}
	
