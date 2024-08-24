public class static_var {
	 static int a=0;//static  variale (a)should always inside static method
    public static void rec( int count) {
    	  
    	a = a + 1;
        System.out.println(a);
        
        if (count < 5) {
            rec( count + 1); // Increment count and call rec() recursively
        }
    }

    public static void main(String[] args) {
        rec( 1); // Start recursion with a = 1 and count = 0
    }
}
