public class A {
    int a = 10;// a is instance variable 
    static int b = 20;

    void add() {
        int c = 30;
        int d = a + b + c;
        System.out.println("a value is" + " " + a);
        System.out.println("Sum of a, b, and c is: " + d);
    }

    void nll() {
        int c = 30; // Assuming you intended to use 'c' here
        int e = 40; // Declaring 'e' inside nll() method
        int f = a * b * e * c; // Calculating 'f' using 'a', 'b', 'e', and 'c'
        System.out.println("Product of a, b, c, and e is: " + f);
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.add(); // Call the add() method
        obj.nll(); // Call the nll() method
        System.out.println("a value is" + " " + obj. a);//we can't acess istance variable without object of class ABC in main method
        System.out.println("b value is" + " " + b );
        System.out.println("b value is" + " " + obj.b );
    }
}
