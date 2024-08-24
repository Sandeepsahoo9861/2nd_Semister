interface Detailinformation {
    void display();
    int count();
}

class Person implements Detailinformation {
    String name;

    Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name = " + name);
        System.out.println("Count = " + count());
    }

    public int count() {
        int characterCount = 0;
        for(int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') {
                characterCount++;
            }
        }
        return characterCount;
    }
}

public class Q7implement {
    public static void main(String[] args) {
        Person p = new Person("Sandeep");
        p.display();
    }
}
