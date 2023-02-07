import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double sayi1,sayi2,islem;
		System.out.print("Bir sayi giriniz.");
		sayi1 = input.nextInt();
		System.out.print("Diger sayiyi giriniz.");
		sayi2 = input.nextInt();
		System.out.print("Yapmak istediginiz islemi seciniz.\ntoplama icin 1\nCikarma icin 2"
				+ "\ncarpma icin 3\nbolme icin4\nsayilarindan birini yaziniz." );
		islem = input.nextInt();
		
		if(islem==1){
			System.out.print(sayi1+sayi2);
		}else if (islem==2){
			System.out.print(sayi1-sayi2);
		}else if(islem==3){
			System.out.print(sayi1*sayi2);
		}else if(islem==4){
			if(sayi2==0){
			System.out.println("Bolme icin 0 girilemez.");	
			}
			else{
			System.out.println(sayi1/sayi2);
			}
		}else{
			System.out.print("Gecersiz islem");
		}
			
		}
}


