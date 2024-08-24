import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println("Sum of digits of "+n+" until the number is a single digit is: "+sum_Of_Digits(n));
			}
		public static int sum_Of_Digits(int n) {
		int sum=0,sum1=0;
		while(n!=0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		while(sum!=0) {
			int r1=sum%10;
			sum1=sum1+r1;
			sum=sum/10;
		}
		return sum1;
	}

}
