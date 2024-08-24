/*
  Design a package that contains two classes Student & Test. The Student class has
data members as name, roll and instance methods inputDetails() & showDetails().
Similarly the Test class has data members as mark1, mark2 and instance methods
inputDetails(), showDetails(), Student is extended by Test. Another package carry
interface Sports with 2 attributes score1, score2. Find grand total mark & score in
another class.
 */
package Q8;


import p1.*;

import p2.*;

//Separate class to Find grand total mark & score

public class Q8 extends Test implements Sports{



	public static void main(String[] args) {

		// Create a Test object

        Test ob= new Test();

        ob.inputDetails("Sandeep Kumar Sahoo", 44); // Set student details

        ob.inputDetails(90, 97); // Set test marks

        ob.showDetails(); // Display student details and test marks

       // Calculate total marks

        int Totalmarks=ob.mark1+ob.mark2;

        System.out.println("Total Marks: " +Totalmarks);



        // Calculate total scores (from Sports interface)

        int Totalscores = score1 + score2;

        System.out.println("Total Scores: " +Totalscores);

	}



}