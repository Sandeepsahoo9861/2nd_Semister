import java.util.Scanner;
public class Exponent_no1{
    // Instance method to calculate power
    int pow(int n, int m) {
        if (m > 0) {
            // Recursive call to calculate power
            return n * pow(n, m - 1);
        } else {
            return 1; // Base case: any number raised to the power of 0 is 1
        }
    }

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the value of m");
    	int m=sc.nextInt();
        Exponent_no obj = new Exponent_no();
        System.out.println(obj.pow(2, m)); // Call instance method on object
    } 
}
