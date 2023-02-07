import java.util.Scanner;
public class KullaniciGirisArayuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k_adi,parola;
		Scanner input = new Scanner(System.in);
		System.out.println("Kullanici adi giriniz:");
		k_adi = input.nextLine();
		System.out.println("Parola giriniz:");
		parola = input.nextLine();
		if(k_adi.equals("admin") && parola.equals("1234")){
			System.out.println("Basari ile giris yaptiniz.");
		}else {
			System.out.println("Kullanici adi veya sifre hatali!");
		}
		
		
		
	}

}
