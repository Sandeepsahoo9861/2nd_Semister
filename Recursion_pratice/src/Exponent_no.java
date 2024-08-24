public class Exponent_no {
    // Recursive function to calculate power
    static int pow(int n, int m) {
        if (m > 0) {
            // Recursive call to calculate power
            return  pow(n, m - 1)*n;
        } else {
            return 1; // Base case: any number raised to the power of 0 is 1
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5 )); // Print 2 raised to the power of 10
    }
}
