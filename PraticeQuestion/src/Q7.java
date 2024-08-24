import java.util.Scanner;

public class Q7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        findMaxMinInfo(a);
    }

    public static void findMaxMinInfo(int[] a) {
        int max = a[0], min = a[0], countMax = 0, countMin = 0, firstOcc = 0, lastOcc = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                countMax = 1;
                firstOcc = i + 1;
            } else if (a[i] == max) {
                countMax++;
            }

            if (a[i] < min) {
                min = a[i];
                countMin = 1;
                lastOcc = i + 1;
            } else if (a[i] == min) {
                countMin++;
                lastOcc = i + 1;
            }
        }

        System.out.println("Maximum element of the array is " + max + " and occurs " + countMax + " times.");
        System.out.println("Minimum element of the array is " + min + " and occurs " + countMin + " times.");
        System.out.println("First occurrence of maximum element is at position " + firstOcc + ".");
        System.out.println("Last occurrence of minimum element is at position " + lastOcc + ".");
    }
}
