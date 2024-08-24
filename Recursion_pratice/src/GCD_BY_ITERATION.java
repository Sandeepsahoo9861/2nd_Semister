import java.util.Scanner;
public class GCD_BY_ITERATION {
	 public static int Gcd( int a, int b){
		for (int i=a;i>=1;i--) {
			if((a%i==0)&& (b%i==0)) {
				return i;
			}
			
		}
		return 1;// In case no other GCD is found, 1 is the GCD of any two numbers.
		
	} 
	
	

	// TODO Auto-generated method stub
		public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the two no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int k=Gcd(a,b);
		System.out.println("GCD IS"+" "+ k);
		

	}

}
