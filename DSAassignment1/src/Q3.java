/*
 Write a java program to check whether a number is a spy number or not. 
Example:
N = 132
Sum of digit of N = 1 + 3 + 2 = 6
Product of digit of N = 1 × 3 × 2 = 6
So, 132 is a spy number.
 */
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		int sum=0;int pro=1; int rem;
		while(no != 0) {
		rem=no% 10;
		sum=sum + rem;
		pro=pro * rem;
		no= no /10;
		}
		if(pro == sum) {
			System.out.println("The no is a spy no");
		}
		else
			System.out.println("The no is not a spy no");
		

	}

}
