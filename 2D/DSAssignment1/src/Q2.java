import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person Weight in kg: ");
		double w=sc.nextDouble();
		System.out.println("Enter height of person in meter: ");
		double h=sc.nextDouble();
		double BMI=w/(h*h);
		if(BMI<18.5) {
			System.out.println("The person is Underweight.");
		}
		else if(BMI>18.5 && BMI<24.9) {
			System.out.println("The person is Normal Weight.");
		}
		else if(BMI>25.0 && BMI<29.9) {
			System.out.println("The person is Overweight.");
		}
		else
			System.out.println("The person is Obese.");
	}

}