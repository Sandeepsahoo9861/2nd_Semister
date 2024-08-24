import java.util.Scanner;
public class H1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        if(a+b==c || b-c==a || a*b==c) {
            System.out.println("Arithmetic Formulas are satisfied");
        }
        else {
            System.out.println("Arithmetic Formulas aren't satisfied");
        }
    }
}
