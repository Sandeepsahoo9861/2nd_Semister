import java.util.Scanner;
public class Q10 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Enter row and column for m*n matrix: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		double a[][]=new double[r][c];
		
		System.out.println("Enter elements for m*n matrix: ");
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j]=sc.nextDouble();
			}
		}
		System.out.println("Enter a specified column to sum: ");
		int columnIndex=sc.nextInt();
		sumColumn(a,columnIndex);
		System.out.println("sum of column "+columnIndex+" = "+sumColumn(a,columnIndex));
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum=0;
		for (int i=0; i<m.length; i++) {
        sum=sum+m[i][columnIndex];
		}
		return sum;
	}
}