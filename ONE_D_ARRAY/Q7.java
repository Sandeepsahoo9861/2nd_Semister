/*Write a method to find the second largest element present in the Array. The method header is 
given below.
public static int sec_max(int[] array)
Write a java program that prompts the user to enter 5 numbers, invokes this method to return
the maximum value, and displays the maximum value. Here is a sample run of the program:
Sample run:
Enter ten numbers: 9 5 7 2 3
The second maximum number is: */
import java.util.Arrays;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		System.out.println("Enter five number: ");{
		for(int i=0; i<5; i++) {
			a[i]=sc.nextInt();
			}
			System.out.println("The second maximum number is: "+sec_max(a));
			}
			}
	public static int sec_max(int[] array){
		int max = array[0];
        int smax = array[0];
        for (int i=0; i<5; i++) {
            if (array[i] > max) {
                smax = max;
                max = array[i];
            } else if (array[i] > smax && array[i] != max) {
                smax = array[i];
            }
        }
        return smax; 
		/* Arrays.sort(array);
        return array[array.length - 2]; */
	}

}
