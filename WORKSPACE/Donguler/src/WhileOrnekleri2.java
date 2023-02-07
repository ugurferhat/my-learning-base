
public class WhileOrnekleri2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		int i =1;
		while(i<=star) {
		int k =1;
			while(k<=i){
			System.out.print("*");
			k++;
			}
			System.out.println();
			i++;
		}
		
	}

}
