/*
 Define an interface DetailInfo to declare methods display( ) & count( ). Another class
Per contains a static data member maxcount, instance member name & method
display( ) to display name of a per, count the no. of characters present in the name
of the per.
 */
interface Detailinfo
{
	void display();
	int count();
}
 class Per implements Detailinfo
{
	static int maxcount;
	String name;
	Per(String name)//constructor name  as class name
	{
		this.name=name;
	}
	public void display() 
	{
		System.out.println("The name of the person is :-"+name);
	}
	public int count()
	{
		return name.length();
	}
}

public class Q7 {
    
    public static void main(String[] args) 
    {
        Per p1=new Per("sandeep");
        p1.display();
	       	int count=p1.count();
	       	System.out.println("The length of the name is "+count);

        
    }
    
}