import java.util.Scanner;
public class NotSinifGecme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int turkish,maths,science,sport,music;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please write Turkish result:");
		turkish = input.nextInt();
		System.out.println("Please write Maths result:");
		maths = input.nextInt();
		System.out.println("Please write Science result:");
		science = input.nextInt();
		System.out.println("Please write Sport result");
		sport = input.nextInt();
		System.out.println("Please write Music result:");
		music = input.nextInt();
		double ortalama = ((turkish+maths+science+sport+music)/5);
		if (ortalama<50 && ortalama>0){
			System.out.println("Ortalama:"+ortalama+" Not ortalamaniz yetersiz. Kaldiniz!");
		}else if (ortalama<0){
			System.out.println("Ortalama:"+ortalama+" Ortalamaniz eksi deger olamaz, tekrar giriniz.");
		}else{
			System.out.println("Ortalama:"+ortalama+" Tebrikler sinifi basari ile gectiniz.");
		}
		
	}

}
