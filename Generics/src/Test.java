public class Test<T> {
     T a;

    Test(T a) {
        this.a = a;
    }

    void display() {
        System.out.println(a);
    } 

    public static void main(String[] args) {
        // Test with Integer
        Test<Integer> ob1 = new Test<Integer>(10);
        ob1.display();

        // Test with Double
        Test<Double> ob2 = new Test<Double>(10.5);
        ob2.display();

        // Test with Character
        Test<Character> ob3 = new Test<Character>('a');
        ob3.display();
    }
}
