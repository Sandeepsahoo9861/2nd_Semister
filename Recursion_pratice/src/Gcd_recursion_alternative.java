import java.util.Scanner;//my method

public class Gcd_recursion_alternative {
    public static int Gcd(int a, int b, int i) {
        if (i == 0) {
            return 1; // Base case: If i reaches 0, return 1
        }
        if ((a % i == 0) && (b % i == 0)) {
            return i; // If i is a common divisor of a and b, return i
        }
        i--;
        return Gcd(a, b, i ); // OR  return Gcd(a, b, i-1 );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a; 
        int k = Gcd(a, b, i);
        System.out.println("GCD IS " + k);
        sc.close();
    }
}
