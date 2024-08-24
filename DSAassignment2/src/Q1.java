/*
 Define a class Person with two instance variables:
 name and age
and two member methods:
 setData(): set the details of the person.
 displayData(): display the details of the person.
Now, create two objects of class person and initialize one object value directly (by
using the dot(.) operator name: “Rohan” and age: 20 ). Accept your name and age
through the keyboard and set them to another object using the setData() method.
Now display both the member variables using the displayData() method. Also, check
who is younger.
 */
import java.util.Scanner;
  class Person{
	  String name;
	  int age;
	   void SetData(String a,int b){
		 name=a;
		 age=b;
	  }
	  
	  void displayData() {
		  System.out.println("Name"+" " + name + " "+"and" + " "+ "Age"+ age);
		  
	  }
  }
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.name="Sandeep";
		p1.age=19;
		p1.displayData();
		//OR
		p1.SetData( "Sandeep",19);
		p1.displayData();
		Person P2=new Person();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String na=sc.nextLine();
		System.out.println("enter the age");
		int ag=sc.nextInt();
		P2.SetData(na,ag);
		P2.displayData();
		

	}

}
