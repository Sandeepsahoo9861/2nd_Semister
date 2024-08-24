//check  if array is sorted (Strickly increasing)
public class arrayShorted {

    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {//it's checking not shorting
            // array is sorted till now
            return isSorted(arr, idx + 1);//return statement is Compulsory while calling as (public static boolean isSorted)
                                         // non void type
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int [] arr = {1, 3, 5, 2};
        System.out.println(isSorted(arr, 0));
    }
}
