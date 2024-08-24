import java.util.Scanner;
public class H2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        String[] line = new String[n];
        System.out.println("Input "+n+" lines:");
        sc.nextLine();
        for(int i = 0; i < n; i++){
            line[i] = sc.nextLine();
        }
        System.out.println("The lines in reverse order: ");
		for(int i=line.length-1;i>=0;i--) {
			System.out.println(line[i]);
		}
    }
}
