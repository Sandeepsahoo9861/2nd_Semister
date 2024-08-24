import java.util.Scanner;

public class Gcd_recursion {

    public static int Gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            if (b == 0) {
                return a;
            }
            return Gcd(b, b % a);
        }
    }

    public static void main(String[] args) {
        // Get user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no");
        int a = sc.nextInt();
        System.out.println("enter the second no");
        int b = sc.nextInt();

        // Calculate and print GCD
        int gcd = Gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
  