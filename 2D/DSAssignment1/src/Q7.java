import java.util.Scanner;
public class Q7 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		int a[]=new int [n];
		input(a);
		findMaxMininfo(a);
	}
	public static void input(int a[]) {
		System.out.println("Enter elements of the array: ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
	}
	public static void findMaxMininfo(int a[]) {
		int max=a[0];
		int min=a[0];
		int count=0;
		int count1=0;
		int firstOcc=0;
		int lastOcc=0;
		// Max ele->
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		// Count max ele->
		for(int i=0; i<a.length; i++) {
			if(a[i]==max) {
				count++;
			}
		}
		// Min ele->	
			for(int i=0; i<a.length; i++) {
				if(a[i]<min) {
					min=a[i];
				}
			}	
		// Count min ele->	
			for(int i=0; i<a.length; i++) {
				if(a[i]==min) {
					count1++;
				}
			}
		// First Occurrence of max ele->		
				for(int i=0; i<a.length; i++) {
					if(a[i]==max) {
						firstOcc=i;
						break;
			}
				}
		// Last Occurrence of min ele->
		for(int i=a.length-1; i>0;i--) {
			if(a[i]==min) {
				lastOcc=i;
				break;
		}
		}
		System.out.println("Minimum element of Array is "+min+" and occurs "+count1+" times.");
		System.out.println("Maximum element of Array is "+max+" and occurs "+count+" times.");
		System.out.println("First occurrence of maximum element "+max+" is at position "+(firstOcc+1)+".");
		System.out.println("Last occurrence of minimum element "+min+" is at position "+(lastOcc+1)+".");
	}
}