import java.util.Scanner;
public class reverse_the_no_recursion {
	public static void  reverseno( int no) {
		if (no<=0) {
			System.out.print( "" + " is the reverse  no");
			//return;
			
		}
		
		else {
		   System.out.print(no %10 );
		   reverseno(no /10);
		   
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt(); 
		System.out.println("the actual no is" + " "+ no);
		reverseno(no);
		

	}

}
