import java.util.Scanner;


public class KonsoldanVeriAlma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		String ad, soyad;
		System.out.println("Adinizi giriniz:");
		ad = input.nextLine();
		System.out.println("Soyadinizi giriniz:");
		soyad = input.nextLine();
		System.out.println("Boyunuzu giriniz:");
		a = input.nextInt();
		System.out.println("Yasinizi giriniz:");
		b = input.nextInt();
		System.out.print("Kilonuzu giriniz:");
		c = input.nextInt();
		
		System.out.println("Birim boy/yas ortalamasi:" + (a/b)+ "cm");
		System.out.println("Boy ve yas farkiniz:" + (a-b));
		
		boolean kosul1 = c==(b+=50);
		String kosul2 = c==(b+=50)?"Kilo/Boy orani: iyi":"Kilo/Boy orani:iyi degil";
		System.out.println(kosul1);
		System.out.println(kosul2);
		
		/* import java.util.Scanner
		Scanner input = new Scanner(System.in);
		int a,b,c;
		String ad, soyad;
		a = input.nextInt();
		ad = input.nextLine();
		soyad = input.nextLine();
		Scanner input2 = new Scanner(System.in);
		int a,b,c;
		System.out.println("adiniz nedir?:");
		a = input.nextline();
		
		 */
	}

}
