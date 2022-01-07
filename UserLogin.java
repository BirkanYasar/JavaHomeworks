import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName = "Birkan";
		String pass ="admin";
		
	System.out.print("Please write your user name: ");
		String a = scan.nextLine();
	System.out.print("Please write your password: ");	
		String b = scan.nextLine();
		
	if(userName.equals(a)&&pass.equals(b)) {
		System.out.println("Username and password are correct!");
	}else if((userName != a)||(pass == b)) {
		System.out.println("Username incorrect.");
		System.out.println("Please try again");
	}else if((userName == a)||(pass != b)) {
		System.out.println("Password is incorrect.");
		System.out.println();
	}
		
	}

}
