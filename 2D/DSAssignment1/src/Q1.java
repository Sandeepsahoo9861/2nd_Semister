import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("The positive integer greater than 2 from command line argument is: ");
		int n=sc.nextInt();
		int count=0;
		while((n=n/2)>=2) {
			count++;
		}
		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+count);
	}

}
