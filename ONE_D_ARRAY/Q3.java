/*Write a java program using an array that reads the integers between 1 and 100 and counts the
occurrences of each. Assume the input ends with 0. 
Sample run:
Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
Note: If a number occurs more than one time, the plural word “times” is used in the output*/
 import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a[]=new int [100];
System.out.println("Enter the integers between 1 and 100: ");
while(true) {
int n=sc .nextInt();
if(n==0)
	break;
else
	a[n]++;     // or alternative a[n] = a[n] + 1;
}
for(int i=0; i<a.length; i++) {
	if(a[i]==1)
		System.out.println(i+" occurs "+a[i]+" time");
	else if(a[i]>1)
	System.out.println(i+" occurs "+a[i]+" times");
}
	}
}

 