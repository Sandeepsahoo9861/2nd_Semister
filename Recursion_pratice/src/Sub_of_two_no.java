import java.util.Scanner;
public class Sub_of_two_no {
	public static  int sub(int a, int b) {
		if (b==0) {
			return a;
		}
		else {
			return sub( a -1,  b-1);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no");
		int a=sc.nextInt();
		System.out.println("enter the second no");
		int b=sc.nextInt();
		System.out.println("the subtraction of two no is"+" " + sub(a,b));
		
		

	}

}
