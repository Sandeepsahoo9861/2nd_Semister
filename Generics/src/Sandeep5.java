public class Sandeep5 {
   
    public static <E> void printArray(E[] inputArray) {
        for(int i = 0; i < inputArray.length; i++)
            System.out.println(inputArray[i]);
    }

    public static void main(String[] args) {
        Integer[] b = {1, 2,  }; 
        printArray(b);
        Double[] ar = {6.1, 3.2, 6.7, 9.4}; 
        printArray(ar);
    }
}
