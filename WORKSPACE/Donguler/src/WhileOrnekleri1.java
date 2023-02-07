import java.util.Scanner;


public class WhileOrnekleri1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cift sayilari yazan program.
		int i=1;
		while (i<=100){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
			}
		
		
		// tek sayilari toplayan ve negatif sayida duran program.
		Scanner input = new Scanner(System.in);
		int sayi;
		int toplama = 0;
		
		while(true){
			System.out.println("Bir sayi giriniz.");
			sayi = input.nextInt();
			if(sayi<0){
				System.out.println("Negatif sayi girilemez.");
				System.out.println("sayi toplami:" + toplama);
				break;
			}
			if (sayi%2==1) {
				toplama=toplama+sayi;
				System.out.println("sayi toplami:" + toplama);
			}else {
				System.out.println("Cift sayi girdiniz. Tek sayi giriniz.");
				break;
			}
			
		}
		
		
		// 2nin kuvvetlerini yazan program.
		Scanner scan = new Scanner(System.in);
		System.out.println("10 uzeri bir sayi giriniz:");
		int sayi2 = scan.nextInt();
		int k=2;
		while (k<=sayi2){
			System.out.println(k);
			k=k+k;
		}
		
		}
		
		
		
		
	}


