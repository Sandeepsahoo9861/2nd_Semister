import java.util.*;
class product
{
	int prodid;
	double price;
	int quantity;
	static double totalprice=0.0;
	product(int prodid,double price,int quantity)
	{
		this.prodid=prodid;
		this.price=price;
		this.quantity=quantity;
	}
	void display() 
	{
		System.out.println(prodid+" "+price+" "+quantity);
	}
}
public class H3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		product p[]=new product[5];
		for(int i=0;i<p.length;i++) 
		{
			
			System.out.println("Enter product details for product :"+(i+1));
			int prodid=sc.nextInt();
			double price=sc.nextDouble();
			int quantity=sc.nextInt();
			p[i]=new product(prodid,price,quantity);
			product.totalprice=product.totalprice+(price*quantity);		
			

		}
		for(int i=0;i<p.length;i++) 
		{
			p[i].display();
		}
		System.out.println("Total price is:"+product.totalprice);
		
	}

}
