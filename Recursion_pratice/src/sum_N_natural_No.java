import java.util.Scanner;
public class sum_N_natural_No {
	public static int sumNnatural(int n) {
		if (n== 0) {
			return 0;
			
		}
		else {
			return n + sumNnatural((n-1) );
		}
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  no");
		int n=sc.nextInt();
		System.out.println("the sum of n natural no is"+ " "+ sumNnatural( n));

	}

}
