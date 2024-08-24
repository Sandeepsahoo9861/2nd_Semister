/*Write a java program to create an array of size N and store the random values between 1 to 100 in it 
and print the number of prime numbers present in the array. 
Sample run:
Enter number of elements 5
Enter Array elements:
11 22 33 39 43
The number of prime numbers are 2.*/
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input array size: ");
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0; i<n; i++) {
		a[i]=(int)((Math.random()*100)+1);
		}
		display(a);
		findNoOfPrime(a);
	}
	public static void display(int a[]) {
		System.out.println("Array is: ");
		for(int i=0; i<a.length; i++) {   //we can't replace a.length with n because the here method is different
			System.out.print(a[i]+" ");	
	}
		}
		public static void findNoOfPrime(int a[]) {
			int c=0;     
			for(int i=0; i<a.length; i++){
				if(isPrime(a[i]))
					c++;
			}
			System.out.println("\nThe number of prime numbers are: "+c);
		}
		public static boolean isPrime(int n) {
			for(int i=2; i<=(int)Math.sqrt(n); i++) {
				if(n%i==0)
					return false;
			}
			return true;
	}

}
