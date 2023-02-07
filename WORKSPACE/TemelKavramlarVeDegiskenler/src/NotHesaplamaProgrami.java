import java.util.Scanner;
public class NotHesaplamaProgrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1= new Scanner(System.in);
		
		int quiz,vize,finnal;
	
		System.out.println("Quiz notunuzu giriniz:");
		quiz = input1.nextInt();
		System.out.println("Vize notunuzu giriniz:");
		vize = input1.nextInt();
		System.out.println("Final notunuzu giriniz:");
		finnal = input1.nextInt();
		
		double ortalama = quiz*0.2 + vize*0.35 + finnal*0.45;
	    System.out.println("Sinav ortalamaniz:" + ortalama);
		
		String sonucyazi = (ortalama >=50)?"Sinavi gectiniz.":"Sinavdan kaldiniz.";
		System.out.println(sonucyazi);
		
		
	}

}
