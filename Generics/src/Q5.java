//write a java method using Generics to count the occurence of an
//an element in an array of any type.The signature count method 
// is given below
//public static <T> int count (T[]array, T item)
 public class Q5 {
	public static <T> int count(T[] arr , T item){
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			if(item == arr[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"b", "c", "d","a","d"};
		
		int count = count(a , "d");
		System.out.println(count);
		Integer arr[] = {1,1,1,2,2,33,3};
		
		count = count(arr, 1);
		System.out.println(count);
	}

}
