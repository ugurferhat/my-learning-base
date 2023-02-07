import java.util.Scanner;
public class EtkinlikOnerenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sicaklik;
		Scanner input = new Scanner(System.in);
		System.out.println("Etkinlik onerisi icin hava sicakligini giriniz:");
		sicaklik = input.nextInt();
		if (sicaklik>=30){
			System.out.println("Bu havada denize gidilir.");
		}else if(sicaklik>4 && sicaklik<30){
			System.out.println("Bu havada sinemaya gidilir.");
		}else{
			System.out.println("Bu havada kayaga gidilir.");
		}
	}

}
