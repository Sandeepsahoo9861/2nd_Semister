// write a simple main class in java that contains an experiment that uses the generics
// Box<T> class to build boxes with different types that verifies that this classed works 
// as advertised . yours experiment should include the following;
// create a boxed string  object  and two variables that refer to that box.change the contents
// of one and determine the effect on the other
//create a boxed integer object and two variables that refer to that box.change the contents of
// one and determine the effect on the other
// create a boxed object and two  variables that refer to that box.Determine what happens if
//you put a string in the box. Determine what happens if you put an Integer
//

// we are using generics in a class. 
//
public class Q6 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<String> stringBoxRef1 = stringBox;
        Box<String> stringBoxRef2 = stringBox;
        stringBoxRef1.set("World");
        System.out.println(stringBoxRef2.get()); 
        Box<Integer> integerBox = new Box<>(1);
        Box<Integer> integerBoxRef1 = integerBox;
        Box<Integer> integerBoxRef2 = integerBox;
        integerBoxRef2.set(2);
        System.out.println(integerBox.get());
        Box<Object> objectBox = new Box<>("Hello");
        Box<Object> objectBoxRef1 = objectBox;
        Box< Object> objectBoxRef2 = objectBox;
        objectBoxRef1.set("World");
        System.out.println(objectBoxRef2.get()); 
        objectBoxRef1.set(3);
        System.out.println(objectBoxRef2.get());
    }
}
class Box<T>{
    public T t;//it declares a member variable named of type T.This means that the box
                // class has a field 't'that hold the value of type T
    public Box(T t){//is a constructor .it initialsizes the t member varible with the value 
    	            //passed  as an argument to the constructor
        this.t = t;// for example->initially t was holding hello
    }
    public T get(){
        return t;
    } 
    public void set(T t){
        this.t = t;// for example -> t is holding World
    }
}