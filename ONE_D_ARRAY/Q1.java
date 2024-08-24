//Write a java program to create an array of size N and store the random values in it and find the 
//sum and average.  
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input array size: ");
		int n=sc.nextInt();
		int lb=1, ub=n+1;
		int a[]=new int [n];
		int sum=0;
		for(int i=0; i<a.length; i++) {
		a[i]= (int)(Math.random()*(ub-lb)+lb);
		System.out.print(a[i]+" ");

		    sum=sum+a[i];
			}
		double avg=(double)sum/(a.length);
		System.out.println("\nsum="+sum);
		System.out.println("Average:"+avg);
				}
}
