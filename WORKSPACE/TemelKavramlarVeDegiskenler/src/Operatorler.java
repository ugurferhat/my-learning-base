
public class Operatorler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		int toplama = a+b;
		int cikarma = a-b;
		int bolme = a/b;
		int carpma = a*b;
		int mod = a%b;
		System.out.println(toplama);
		
		toplama++;
		System.out.println(toplama);
		// toplama++; demek sayiyi 1 artir demek
		// toplama=toplama + 1; diye de yazilabilir.
		
		System.out.println(cikarma);
		cikarma--;
		System.out.println(cikarma);
		
		System.out.println(bolme);
		System.out.println(carpma);
		System.out.println(mod);
		
		int sonuc = ++a * --b;
		// ++a ve --b yazarsak a ve b yi 1 arttirip islem yapar.
		// ama a++ ve b-- yazarsak once a*b degerini hesaplar sonra sayilari birer arttirir veya azaltir.
		System.out.println(sonuc);
		System.out.println(a);
		System.out.println(b);
		
		boolean kosul1 = (a+b == 9);
		boolean kosul2 = a!= b;
		// != isareti esit degildir demektir.
		System.out.println(kosul1);
		System.out.println(kosul2);
		
		int sayi1 = 9;
		int sayi2 = 3;
		boolean kosul3 = (sayi1 > sayi2) && (sayi1 < sayi2);
		System.out.println(kosul3);
		// && ve demek
		kosul3 = (sayi1 > sayi2) || (sayi1 < sayi2);
		System.out.println(kosul3);
		// || veya demek
		
		boolean kosul4 = !(sayi1>sayi2 && sayi2>sayi1);
		System.out.println(kosul4);
		
		String kosul5 = (sayi1==sayi2)?"dogru":"yanlis";
		System.out.println(kosul5);
		// () ? : bu semboller kosullu dogru yanlis sembolleridir.
		
		String kosul6 = (sayi1!=sayi2)?"1":"2"; //(kosullarda int kullanilmaz. string kullanilir)
		System.out.println(kosul6); 
		sayi1 +=3;
		System.out.println(sayi1);
		// += toplama opreratoru manasi; sayi1 = sayi1 + 3; demektir
		
		sayi2 -=1;
		System.out.println(sayi2);
		
		sayi1 *=4; // sayi1 = 12 olmustu
		System.out.println(sayi1);
		
		sayi1 /=6; //sayi1 = 48 olmustu
		System.out.println(sayi1);
		
		sayi1 %=5; //sayi1= 8 olmustu
		System.out.println(sayi1);

		
		
		
				
				
				
				
		
	}

}
