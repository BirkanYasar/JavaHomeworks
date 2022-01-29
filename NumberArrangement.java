import java.util.Scanner;

public class NumberArrangement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a sayısını giriniz: ");
		int a = scan.nextInt();
		System.out.print("b sayısını giriniz: ");
		int b = scan.nextInt();
		System.out.print("c sayısını giriniz: ");
		int c = scan.nextInt();
		
		if((a>b)&&(a>c)&&(b>c)) {
			System.out.println("Sıralama : a>b>c şeklindedir.");
		}
		if((a>b)&&(a>c)&&(c>b)) {
			System.out.println("Sıralama : a>c>b şeklindedir");
		}
		if((b>a)&&(a>c)&&(b>c)) {
			System.out.println("Sıralama : b>a>c şeklindedir");
		}
		if((b>a)&&(c>a)&&(b>c)) {
			System.out.println("Sıralama : b>c>a şeklindedir");
		}
		if((c>b)&&(a>b)&&(c>a)) {
			System.out.println("Sıralama : c>a>b şeklindedir");
		}
		if((b>a)&&(c>a)&&(c>b)) {
			System.out.println("Sıralama : c>b>a şeklindedir");
		} 		
		
	}

}
