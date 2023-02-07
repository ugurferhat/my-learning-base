import java.util.Scanner;
public class UcakBiletiProgrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km,yas,tip,fiyatNormal,fiyatIndirim;
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen ucus mesafesini giriniz:");
		km = input.nextDouble();
		System.out.println("Lutfen yasinizi giriniz:");
		yas = input.nextDouble();
		System.out.println("Yolculuk cesidi seciniz:\nTek Yon = 1, Gidis Donus = 2 (yaziniz.)");
		tip =input.nextDouble();
		fiyatNormal = km*0.10;
		
		if ((km>0 && yas>0)&&(tip==1||tip==2)){
			
			if(yas<=12){
				fiyatIndirim=tip*fiyatNormal-((tip*fiyatNormal)*0.2);
				System.out.println("Fiyat$:" + fiyatIndirim);
			}else if (yas>=65){
				fiyatIndirim=tip*fiyatNormal-((tip*fiyatNormal)*0.4);
				System.out.println("Fiyat$:" + fiyatIndirim);
			}else{
				System.out.println("Fiyat$:"+tip*fiyatNormal);
			}
			
		}else {
			System.out.println("Girdiginiz veriler hatali,lutfen tekrar giriniz.");
		}
		
		
		
		
		
	}

}
