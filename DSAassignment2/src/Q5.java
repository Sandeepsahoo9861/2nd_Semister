/*
 Define a base class human with instance variable name, age. The instance variables
are initialized through constructors. The prototype of constructor is as below.
human(string, int)
Define a derived class Employee with instance variables Eid, salary. The instance
variables are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double).
Another instance method of Employee class is empDisplay() to display the information
of employee details. 
 */
 
class human {
    String name;
    int age;

    human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends human {
    int Eid;
    double Salary;

    Employee(String name, int age, int Eid, double Salary) {
        super(name, age);
        this.Eid = Eid;
        this.Salary = Salary;
    }

    public void empDisplay() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: " + Salary);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Employee sc = new Employee("Sandeep", 19, 67, 90000);
        sc.empDisplay();
    }
}
