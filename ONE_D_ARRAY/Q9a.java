import java.util.Scanner;
public class Q9a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   // Prompt the user to enter 5 numbers
		        Scanner input = new Scanner(System.in);
		        int[] arr = new int[5];
		        System.out.println("Enter 5 numbers:");
		        for (int i = 0; i < arr.length; i++) {
		            arr[i] =
		        
		        // Prompt the user to enter the element to search for
		        System.out.println("Enter the element to search for:");
		        int target = input.nextInt();
		        
		        // Use the linear search method to find the element
		        int result = linearSearch(arr, target);
		        
		        // Display the result
		        if (result != -1) {
		            System.out.printf("The element %d is present at index %d.\n", target, result);
		        } else {
		            System.out.printf("The element %d is not present in the array.\n", target);
		        }
		    }
		    
		    public static int linearSearch(int[] arr, int target) {
		        /*
		         * Perform a linear search on the given array to find the target element.
		         * 
		         * Returns:
		         * - The index of the first occurrence of the target element in the array, or -1 if the element is not found.
		         */
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == target) {
		                return i;
		            }
		        }
		        return -1;
		    
	}

}
