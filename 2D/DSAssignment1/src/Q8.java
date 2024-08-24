import java.util.Scanner;
public class Q8 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number of rows and column of 2-D Array: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int [m] [n];
		input(a);
		SumOfEleOfMatrix(a);
	}
		public static void input(int a[][]) {
		System.out.println("Enter elements of 2-D Array: ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		}
		public static void SumOfEleOfMatrix(int a[][]) {
			int sum=0;
		System.out.println("The elements of 2-D Array are: ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
			}
			System.out.println();
		}
		System.out.println("The sum of elements of the 2D-Array is: "+sum);
	}

}