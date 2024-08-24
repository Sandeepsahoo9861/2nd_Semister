/*Write a java program that implements the array reversal algorithm suggested in Note 1.
Note 1: There is a simpler algorithm for array reversal that starts out with two indices, i=0 
and j=n-1. With each iteration i is increased and j is decreased for i<j.*/
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Input array size: ");
int n=sc.nextInt();
int a[]=new int[n];

System.out.println("Input array element: ");
for(int i=0; i<a.length; i++) {
	a[i]=sc.nextInt();
}
int l=a.length;
int n1=Math.floorDiv(l, 2);
int temp;

for(int i1=0; i1<n1; i1++) {
	temp=a[i1];
	a[i1]=a[l-1-i1];
	a[l-1-i1]=temp;
}
/* for(int element: a) {
	System.out.print(element+" "); */
System.out.print("The reversal array elements are: ");
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
}
}
}
