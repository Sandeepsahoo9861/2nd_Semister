/*Write a method to find the smallest element present in the Array. The method header is given 
below
public static double min(double[] array)
Write a java program that prompts the user to enter ten numbers, invokes this method to return
the minimum value, and displays the minimum value. Here is a sample run of the program:
Sample run:
Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
The minimum number is: 1.5 */
import java.util.Scanner;
public class Q4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ten Numbers :");
		double a[] = new double[10];
		for(int i=0; i<10; i++)
		{
			a[i]=sc.nextDouble();
		}
		System.out.println("Smallest Number is the array ="+min(a));
	}
	public static double min(double array[])
	{
		double min=array[0];
		for(int a=1; a<10; a++)
		{
			if(min>array[a])
				min=array[a];
		}
		return min;
	}
}
