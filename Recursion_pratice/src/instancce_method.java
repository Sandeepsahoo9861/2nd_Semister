public class instancce_method {
    public void rec(int count) {
        int a = 1; // Variable a is initialized to 1
        a = a + 1; // Increment a by 1
        System.out.println(a); // Print the value of a (which is 1)
        
        if (count < 5) {
            rec(count + 1); // Recursively call rec() with incremented count
        }
    }

    public static void main(String[] args) {
    	instancce_method  obj = new instancce_method (); // Create an instance of the class
        obj.rec(1); // Call the instance method rec on the object
    }
}
