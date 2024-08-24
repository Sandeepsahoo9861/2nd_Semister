import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter ten numbers: ");
//double n=sc.nextInt();
double array[]= new double [10];
//input(array);
	/*public static void input(double[] array) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input array element: ");
		for(int i=1; i<array.length; i++) {
			array[i]=sc.nextDouble(); */ 
	for(int i=1; i<=10; i++) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter ten numbers: ");
		//double sElement=min(array);
		//System.out.println(array[i]);
		array[i]=sc.nextDouble();
		}
	System.out.println("The minimum element in an array: "+min(array));
	}
public static double min(double[] array) {
double min=array[0];
for(int i=1; i<10; i++) {
	if(array[i]<min) {
		min=array[i];
	}
}
	return min;
}
	}
