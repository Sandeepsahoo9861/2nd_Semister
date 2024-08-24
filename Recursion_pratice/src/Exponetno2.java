public class Exponetno2 {
    // Recursive function to calculate power
    static int pow(int n, int m) {
        if (m == 0) {
        	return 1;
        }
            
            return  pow(n, m - 1)*n;
      
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5 )); // Print 2 raised to the power of 10
    }
}
