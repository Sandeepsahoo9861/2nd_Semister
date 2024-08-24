// we are using generics in a method
public class Q1 {
    public static <E> void print(E a[]) {//The method signature public static <E> void print(E a[]) uses generics (<E>) to ->1
        for(int i = 0; i < a.length; i++)//indicate that print is a generic method that takes an array (a[]) of elements of type E. This
            System.out.println(a[i] + "");//allows you to use the same method to print arrays of different types without having to write 
    }                                      //separate methods for each type.

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer b[] = {1, 2, 3}; // Integer should be capitalized
        print(b);//it will call statement 1
        Double ar[] = {6.1, 3.2, 6.7, 9.4}; // Double should be capitalized
        print(ar);
    }
}
