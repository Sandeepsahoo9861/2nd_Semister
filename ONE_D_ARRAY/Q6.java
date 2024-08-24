//Write a method to find the second smallest element present in the Array. The method header 
//is given below.
//import java.util.Arrays;
//Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
//The second minimum number is: 1.9
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		double a[]=new double[10];
		for(int i=1; i<10; i++) {
			a[i]=sc.nextDouble();
		}
		System.out.println("The second minimum number is: "+sec_small(a));
	}
		public static double sec_small(double[] array) {
			double min = Integer.MAX_VALUE;
	        double smin = Integer.MAX_VALUE;
	       for (int i=1; i<10; i++) {
	            if (array[i] < min) {
	                smin = min;
	                min = array[i];
	            } else if (array[i] < smin && array[i] != min) {
	                smin = array[i];
	            }
	        }
	        return smin;
	        
	        /*for(double num: array) {
	        	if(num<min) {
	        		min=num;
	        		smin=min;
	        	}else if (num<smin && num != min) {
	        		smin=num;
	        	}
	        }
	        return smin;
			
			Arrays.sort(array);
	        double smin = array[2];
	        return smin;*/
		}
}
