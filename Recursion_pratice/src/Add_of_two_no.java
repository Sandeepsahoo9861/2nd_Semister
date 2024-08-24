import java.util.Scanner;

public class Add_of_two_no {

    public static  int add(int a, int b) {
        if (b == 0) {
            return a; // Base case: return a if b is 0
        } else {
            return add(a + 1, b - 1); // Recursive case: add (a + 1) to (b - 1)...return statement is compulsory with function call
        }                            //as it has Add_of_two_no is non void typ e
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("The sum is: " + add(a, b));
        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
