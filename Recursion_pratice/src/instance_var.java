public class instance_var {
    public static void rec( int count) {
    int a=0;//a is instance variable it out side of static method a is update to 1
    	a = a + 1;
        System.out.println(a);
        
        if (count < 5) {//here count is parameter it is like static varible it update 
            rec( count + 1); // Increment count and call rec() recursively
        }
    }

    public static void main(String[] args) {
        rec( 1); // Start recursion with a = 1 and count = 0
    }
}
