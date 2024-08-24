import java.util.Scanner;
public class Q9 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter row and column for n*n matrix: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		double m[][]=new double[r][c];
		
		System.out.println("Enter elements for n*n matrix: ");
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				m[i][j]=sc.nextDouble();
			}
		}
		sumMajorDiagonal(m);
		System.out.println("Sum of the elements in the major diagonal is: "+sumMajorDiagonal(m));
}
	public static double sumMajorDiagonal(double[][] m) {
		double sum=0;
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				if(i==j) {
				sum=sum+m[i][j];
			}
		}
		}
		return sum;
	}
}