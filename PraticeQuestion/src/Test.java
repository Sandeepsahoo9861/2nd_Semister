class A1 {
    int a = 10;
    void disp() {
        System.out.println(a);//date-1/4/24
    }
}

class B extends A1 {
    int a = 20;
    void disp() {
        System.out.println(a + 30);
    }
}

class C extends B {
    int a = 30;
    void disp() {
        System.out.println(a);
    }
}

public class Test {

    public static void main(String[] args) {
        A1 ob = new A1();
        ob.disp(); // This will print 10
        System.out.println(40);
        System.out.println(ob.a); // This will print 10

        B obB = new B();
        obB.disp(); // This will print 50 (20 + 30)
        System.out.println(obB.a); // This will print 20

        C obC = new C();
        obC.disp(); // This will print 30
        System.out.println(obC.a); // This will print 30
    }
}
