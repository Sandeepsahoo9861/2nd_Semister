/*
  Write a Java program that can take a positive integer greater than 2 as input and write out  the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.
 */
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter postive integer greater than 2");
		int no=sc.nextInt();
		int rep=0;
		while (no > 2) {
		no= no/2;{
		 if (no == 2 || no > 2)
			rep=rep +1;
			
		}
		
		}
		System.out.println("the no is divided by 2" + " " + rep + " " + "times");

	}

}
