import java.util.Scanner;

public class NumberArrangement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a say�s�n� giriniz: ");
		int a = scan.nextInt();
		System.out.print("b say�s�n� giriniz: ");
		int b = scan.nextInt();
		System.out.print("c say�s�n� giriniz: ");
		int c = scan.nextInt();
		
		if((a>b)&&(a>c)&&(b>c)) {
			System.out.println("S�ralama : a>b>c �eklindedir.");
		}
		if((a>b)&&(a>c)&&(c>b)) {
			System.out.println("S�ralama : a>c>b �eklindedir");
		}
		if((b>a)&&(a>c)&&(b>c)) {
			System.out.println("S�ralama : b>a>c �eklindedir");
		}
		if((b>a)&&(c>a)&&(b>c)) {
			System.out.println("S�ralama : b>c>a �eklindedir");
		}
		if((c>b)&&(a>b)&&(c>a)) {
			System.out.println("S�ralama : c>a>b �eklindedir");
		}
		if((b>a)&&(c>a)&&(c>b)) {
			System.out.println("S�ralama : c>b>a �eklindedir");
		} 		
		
	}

}
