import java.util.Arrays;

public class Sorting_of_array {

    public static void main(String[] args) {
        int arr[] = {8, 8, 4, 2, 1};
        Arrays.sort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
