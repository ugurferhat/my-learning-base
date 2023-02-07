import java.util.Scanner;


public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sayi;
		while (true){
			System.out.println("Bir sayi giriniz.");
			sayi = input.nextInt();
			if(sayi ==0){
				System.out.println("Dongu bitti");
				break;
			}
			System.out.println(sayi);
			break;
		}
		
		for(int i=1; i<=5; i++){
			
			if(i==4){
				System.out.println("asayiyi atladi");
				 continue; // asagidaki kod 4 sayisini yazmadan devam ediyor.
			}
			System.out.println("i=" + i);
		}
		
		
	}
}

