class B1 {
    int a = 10;
    void disp() {
        System.out.println(a);//date-1/4/24
    }
}

class L extends B1 {
    int a = 20;
    void disp() {
        System.out.println(a + 30);
    }
}

class M extends L {
    int a = 30;
    void disp() {
        System.out.println(a);
    }
}

public class Test2 {

    public static void main(String[] args) {
        B1 ob = new L();
        ob.disp(); // This will print 10
        System.out.println(40);
        System.out.println(ob.a); // This will print 10

        
    }
}
