
public class ForDongusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++){
			System.out.println(i + " elma");
			int sayi = 1;
			while(sayi<=3){
				System.out.println(sayi + "armut");
				sayi++;
			}		
			// donguler birbiri icine yazilabilir.
		}
		
		int a=1;
		while(a<=5){
			System.out.println("eeer");
			a++;
			for(int k=1;k<=3;k++){
				System.out.println("ree");
			}
			
		}
		int g=9;
		for (int u =3; u>=0;u--){
			
			if(g>=6){
				System.out.println(g + "evet");
				g--;
				
			}
			System.out.println(u + "hayir");
		}
		
	}

}
