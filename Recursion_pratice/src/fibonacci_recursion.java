//The sequence of numbers 1,1,2,,3,5,8,13 etc are called Fibonacci number each is the sum of the
// preceding two.Write a recursive method in javawhich given n returnsthe nth Fibonacci number
import java.util.Scanner;
public class fibonacci_recursion {
	public static int fibonacci(int n) {
	    if (n == 0) {
	        // Handle base case for n <= 0
	        // Assuming the first Fibonacci number is 0
	        return 0;
	   } else if (n == 1) {
	       return 1;
	    } else {
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nth term");
		int n=sc.nextInt();
		int k=fibonacci(n);
		System.out.println("nth Fibonacci number is" + " "+ k );
		

	}

}
