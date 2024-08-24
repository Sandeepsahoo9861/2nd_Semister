/*
 Write a java method to calculate the sum of digits of a given number until the number is a 
single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
Example:
 Let n = 9294
 Sum = 9 + 2 + 9 + 4 = 24
 Sum = 2 + 4 = 6
Sample Run:
Enter a number 9294
Sum of digits of 9294 until the number is a single digit is 6

 */
import java.util.Scanner;
public class Q5
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int n=sc.nextInt();
      //  int sum=sum_of_Digits(n);
       
        System.out.println("The sum of digit until single digit is" + sum_of__Digits( n) );
    }
    

public static int sum_of__Digits(int n)
{
    while(n>9)
        {
            int sum=0;int rem;
            while(n!=0)
            {
                
                rem=n%10;
                sum =sum +rem;
                n=n/10;
            }
           n=sum;
            
        }
    return n;}}