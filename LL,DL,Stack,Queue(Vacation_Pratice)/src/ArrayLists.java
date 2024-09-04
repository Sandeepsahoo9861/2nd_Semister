import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> List=new ArrayList<Integer>();
		ArrayList  <String> List1=new ArrayList<String>();
		ArrayList <Boolean> List2=new ArrayList<Boolean>();
		
		//add elements
		List.add(5);
		List.add(3);
		List.add(2);
		System.out.println(List);
		//to get elements
		int element=List.get(1);//it will give 1 index value
		System.out.println(element);
		
		//add element
		List.add(2,89);//2 is the index no and 89 is added at index 2;
		System.out.println(List);
		
       // Set element
		List.set(0, 67);//we set 67 value at index 0;
		System.out.println(List);
		
		//delete element
		List.remove(0);//0 is the index,we remove 0 index value
		System.out.println(List);
		
		//Size of list
		int Size=List.size();
		System.out.println(Size);
		
		//loop
		for(int i=0;i<List.size();i++) {
			System.out.print(List.get(i) + ",");
			// Shorting the list
			Collections.sort(List);
			System.out.println(List);
			
		}
	}

}
