import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your height (in meters) :");
		double a = scan.nextDouble();
		System.out.print("Please enter your weight (in kilograms) :");
		double b = scan.nextDouble();
		
		double result = (b /(a*a));
		System.out.println("BMI :"+ result);
	}

}//BirkanYasar...
