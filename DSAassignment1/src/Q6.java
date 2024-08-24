import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = sc.nextInt();
        
        System.out.println("The number is odd: " + isOdd(i));
    }

    public static boolean isOdd(int i) {
        if ((i & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
