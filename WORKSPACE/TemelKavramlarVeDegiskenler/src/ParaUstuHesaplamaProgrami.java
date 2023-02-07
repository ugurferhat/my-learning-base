import java.util.Scanner;
public class ParaUstuHesaplamaProgrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input2 = new Scanner(System.in);
		
		double harcama,odeme,paraustu, kdv=0.18;
		double kdvliFiyat, kdvNet;
		System.out.println("Harcama tutarini yaziniz(TL):");
		harcama = input2.nextDouble();
		
		System.out.println("Odediginiz Para Miktarini Giriniz:");
		odeme = input2.nextDouble();
		
		kdvliFiyat = (harcama + harcama*kdv);
		kdvNet = harcama*kdv;
		
		
		paraustu = odeme - kdvliFiyat;
		System.out.println("Para ustunuz:\n" + odeme + "\n" + "-" + harcama + "\n" + "-" 
		+ kdvNet + "KDV\n" + paraustu + "TL");
		
	}

}
