import java.util.Scanner;
public class DaireninAlaniHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double yaricap, pi=3.14;
		System.out.println("Dairenin yaricapini giriniz:");
		Scanner input = new Scanner(System.in);
		yaricap = input.nextDouble();
		double alan, cevre;
		alan = pi*(yaricap*yaricap);
		cevre = 2*pi*yaricap;
		System.out.println("Dairenin Alani:" + alan);
		System.out.println("Dairenin Cevresi:" + cevre);
		 
	}

}
