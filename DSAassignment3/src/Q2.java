import java.util.*;

public class Q2 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        String[] colours = new String[4];

        System.out.println("Enter four colours:");

        for (int i = 0; i < colours.length; i++) {
            colours[i] = obj.nextLine();
        }

        try {
            for (int i = 0; i < colours.length; i++) {
                Integer.parseInt(colours[i]);//if you put string value it jump to catch block(1)
            }// it can't convert string to integer it jump to catch block()1
        } catch (NumberFormatException e) {//(1)
            System.out.println("NumberFormatException: Please enter a valid colour name.");
        }

        try {
            System.out.println("Enter one more color ");
            colours[4] = obj.nextLine();//as array size is 4(0,1,2,3) but you are puting another element so 
        } catch (ArrayIndexOutOfBoundsException e) {//(2) //it jump to catch block (2)
            System.out.println("ArrayIndexOutOfBoundsException: You can only enter four colours.");
        }

        System.out.println("The colours entered are:");
        for ( int i=0;i<4;i++) {
            System.out.println(colours [i]);
        }
    }
}
