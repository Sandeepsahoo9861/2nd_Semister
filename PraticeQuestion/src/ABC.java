public class ABC {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ABC ob1 = new ABC();
      //  System.out.println(a); we can't acess istance variable without object of class ABC in main method
        System.out.println(ob1.a); // Accessing non-static variable 'a' through object 'ob1'
        System.out.println(b); // Accessing static variable 'b' through class name 'ABC'
        System.out.println(ob1.b); // Accessing static variable 'b' through object 'ob1'

    }
}
