import java.util.Scanner;

public class H3 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter array size: ");
int n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int c[]=new int[n];
System.out.println("Input element for array 1: ");
for(int i=0; i<a.length; i++) {
	a[i]=sc.nextInt();
}
System.out.println("Input element for array 2: ");
for(int i=0; i<b.length; i++) {
	b[i]=sc.nextInt();
}
System.out.println("Dot product of array 1 and 2 is: ");
for(int i=0; i<c.length; i++) {
	c[i]=a[i]*b[i];
	System.out.print(c[i]+" ");
}
	}
}