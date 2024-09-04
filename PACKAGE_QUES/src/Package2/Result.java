package Package2;
import Package1.*;

interface Sports {
    double score1 = 67.20;
    double score2 = 98.99;
}

public class Result extends Test implements Sports {
    public static void main(String[] args) {
        Result r1 = new Result(); // Object of Result class
        r1.inputDetails();        // Calls the inputDetails() method from Test class
        r1.showDetails();         // Calls the showDetails() method from Test class
        double grandTotal = r1.mark1 + r1.mark2 + Sports.score1 + Sports.score2;
        System.out.println("Grand Total Mark: " + grandTotal);
    }
}


//r1.inputDetails(); calls the inputDetails() method from the Test class rather 
//than the Student class is because
// The Test class inherits from the Student class.
// The Result class inherits from the Test class.
//
//Given the object Result r1 = new Result(); and the call r1.inputDetails();:
//Step 1: Java checks if the Result class has an inputDetails() method. It doesn’t,
// so it moves to the superclass.
//Step 2: Java finds that the Test class (the superclass of Result) has an inputDetails() method
//Step 3: Since Test overrides the inputDetails() method from Student, Java calls the Test version.
//

