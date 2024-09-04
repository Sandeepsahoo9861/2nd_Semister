// Package Structure:

// Package1
//    ├── Student.java (Super class)
//    └── Test.java (Inherited class)
//
// Package2
//    └── Sports.java (Interface)
//    └── Result.java


package Package1;

import java.util.Scanner;

public class Student {
    protected String name;
    protected int roll;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
    }

    public void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + roll);
    }
}
