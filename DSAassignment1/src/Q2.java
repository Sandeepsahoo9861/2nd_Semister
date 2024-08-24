import java.util.*;
public class Q2 {
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the weight value");
        double w=sc.nextDouble();
        System.out.println(" enter height");
        double h=sc.nextDouble();
        double bmc=w/(h*h);
        if(bmc<18.5)
        {
            System.out.println("underweight");
        }
        else if(18.5>bmc && bmc<24.9)
        {
            System.out.println("normal weight");
        }
        else if( 25.0 > bmc &&bmc<29.9)
        {
            System.out.println("overweight");
        }
        else
        {
            System.out.println("obese");
        }
        
    }
    
}