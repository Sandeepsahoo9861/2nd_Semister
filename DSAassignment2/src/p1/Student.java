package p1;//Create a package P1 for Student and Test class

class Student {

	private String name;
	int roll;

	public void inputDetails(String Name, int Roll)

	{
		this.name = Name;
		this.roll = Roll;

	}

	public void showDetails()

	{

		System.out.println("Student Name: " + name);

		System.out.println("Roll Number: " + roll);

	}

}