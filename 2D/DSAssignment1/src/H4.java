import java.util.Scanner;
public class H4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column for n*n matrix: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		double a[][]=new double[r][c];
		double b[][]=new double[r][c];
		inputMatrix1(a);
		inputMatrix2(b);
		addMatrix(a,b);
		double sumMatrix[][]=addMatrix(a,b);
		displaySumMatrix(sumMatrix);
			}
			public static void inputMatrix1(double a[][]) {
				System.out.println("Enter elements for Matrix-1: ");
				Scanner sc=new Scanner(System.in);
				for(int i=0; i<a.length; i++) {
					for(int j=0; j<a[i].length; j++) {
						a[i][j]=sc.nextDouble();
					}
		}
			}
			public static void inputMatrix2(double b[][]) {
				System.out.println("Enter elements for Matrix-2: ");
				Scanner sc=new Scanner(System.in);
				for(int i=0; i<b.length; i++) {
					for(int j=0; j<b[i].length; j++) {
						b[i][j]=sc.nextDouble();
					}
		}
			}
			public static double[][] addMatrix(double[][] a, double[][] b){
			double c[][]=new double[a.length][a[0].length];
				for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					c[i][j]=a[i][j]+b[i][j];
					}
			}
				return c;
		}
			public static void displaySumMatrix (double m[][]) {
				System.out.println("Sum of matrices is: ");
				for(int i=0; i<m.length; i++) {
					for(int j=0; j<m[i].length; j++) {
						System.out.print(m[i][j]+" ");
					}
					System.out.println();	
				}
	}
}
