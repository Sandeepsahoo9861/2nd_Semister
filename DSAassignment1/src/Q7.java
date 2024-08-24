/*Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.*/
import java.util.Scanner;// very important remember this 7A
public class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {//For the input "4 3 2 1", here's what happens step by step(for max case explanation
            arr[i] = sc.nextInt();//First iteration (i = 1
        }
		//sc.close();//Since arr[1] is 3, which is less than max (4), the if condition is not met. So, it 
        
        int max = arr[0], min = arr[0], maxCount = 1, minCount = 1;//goes to the else if condition. Since arr[1] ,.
        int maxIndex = 0, minIndex = 0;//is not equal to max, this block doesn't execute
        for (int i = 1; i < n; i++) {//Second iteration (i = 2)
            if (arr[i] > max) {//arr[2] is 2, which is less than max (4). So, it doesn't update max, maxCount, or maxIndex
                max = arr[i];
                maxCount = 1;
                maxIndex = i;
            } 
			else if (arr[i] == max) {
                maxCount++;
            }
            if (arr[i] < min) {
                min = arr[i];
                minCount = 1;
                minIndex = i;
            } 
			else if (arr[i] == min) {
                minCount++;
            }
        }
        System.out.println("Maximum element of Array is " + max + " and occurs " + maxCount + " times.");
        System.out.println("Minimum element of Array is " + min + " and occurs " + minCount + " times.");
        System.out.println("First occurrence of maximum element is at position " + (maxIndex+1) + ".");
        System.out.println("Last occurrence of minimum element is at position " + (minIndex+1) + ".");
    }
}



