
public class IfElseKullanimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b= 40;
		int c =10;
		
		if (a>b){
			System.out.println("A, B'den buyuktur.");
		}else if (a>c){
			System.out.println("A, C'den buyuktur.");
		}else {
			System.out.println("A, B ve C'den kucuktur.");
		}
		
		int d = 30;
		int e = 60;
		int f = 90;
		
		if ((d>e && d>f)){
			System.out.println("D en buyuk sayidir.");
		}else if (e>f && e>d){
			System.out.println("E en buyuk sayidir.");
		}else {
			System.out.println("F en buyuk sayidir.");
		}
	
		
	}

}
