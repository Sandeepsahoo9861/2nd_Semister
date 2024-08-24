import java.util.Scanner;
public class P1 {
    static int fun(int n) {
        if (n > 0) {
            return  fun(n - 1) + n;
        }
        return 0;
    }

     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the digit up to which you want to find the sum");
    	 int a=sc.nextInt();
       
        System.out.println(fun(a)); // Added parentheses after fun
    }
}
