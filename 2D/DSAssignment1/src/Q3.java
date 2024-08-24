import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int n1=n;
		int sum=0, product=1;
		while(n!=0) {
			int r=n%10;
			sum=sum+r;
			product=product*r;
			n=n/10;
		}
		System.out.println("sum= "+sum);
		System.out.println("product= "+product);

		if(sum==product) {
			System.out.println(n1+" is a spy number.");
		}else {
				System.out.println(n1+" is not a spy number.");
		}
	}

}
