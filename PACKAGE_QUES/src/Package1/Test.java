package Package1;

import java.util.Scanner;

public class Test extends Student {
    public double mark1;
    public double mark2;

    @Override
    public void inputDetails() {
        super.inputDetails(); // Calls Student's inputDetails()
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        mark1 = scanner.nextDouble();
        System.out.print("Enter mark 2: ");
        mark2 = scanner.nextDouble();
    }

    @Override
    public void showDetails() {
        super.showDetails(); // Calls Student's showDetails()
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}
