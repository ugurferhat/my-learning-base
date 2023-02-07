import java.util.Scanner;
public class SwitchCaseKullanimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	
	int sayi;
	System.out.println("Lutfen 1'den 3'e kadar bir sayi giriniz:");
	sayi = scan.nextInt();
	switch (sayi){
	case 1:
		System.out.println("Sansli renginiz kirmizi.");
		break;
	case 3: 
		System.out.println("Sansli renginiz yesil.");
		break;
	case 2:
		System.out.println("Sansli renginiz beyaz.");
		break;
	default:
		System.out.println("Gecersiz bir sayi girdiniz.");
		
	}
	}

}
