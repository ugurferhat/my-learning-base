import java.util.Scanner;


public class SayilariBuyuktenKucuge {

	public static void main(String[] args) {
		int a,b,c;
		Scanner input = new Scanner(System.in);
		
		System.out.println("a,b,c sayilarini sirayla giriniz:");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		// a>b>c a>c>b
		if (a>b && a>c && b>c){
			System.out.println("a>b>c");
		}else if(a>b && a>c && c>b){
			System.out.println("a>c>b");
		}else if (b>a && b>c && a>c){
			System.out.println("b>a>c");
		}else if (b>a && b>c && c>a){
			System.out.println("b>c>a");
		}else if (c>a && c>b && a>b){
			System.out.println("c>a>b");
		}else {
			System.out.println("c>b>a");
		}	
		
		
	}

}
