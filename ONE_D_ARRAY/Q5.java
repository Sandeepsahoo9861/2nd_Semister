//Write a method to find the largest element present in the Array. The method header is given 
//below
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a[]=new int [5];
System.out.println("Enter five number: ");{
for(int i=1; i<5; i++) {
	a[i]=sc.nextInt();
	}
	System.out.println("The maximum number is: "+max(a));
	}
	}
public static int max(int[] array) {
	int max=array[0];
	for(int i=1; i<5; i++) {
		if(max<array[i]) {
			max=array[i];
		}
	}
	return max;
	}
}
