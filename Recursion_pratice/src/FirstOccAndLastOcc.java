//find the first and last occurence of an element of the string
public class FirstOccAndLastOcc {
	public static int first=-1;
	public static int last=-1;
	public static void findOccurence(String str,int idx, char element) {
		if (idx ==str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currChar=str.charAt(idx);
		if(currChar ==element) {
			if(first == -1) {
				first = idx;//  once first index is updated to idx no . (now first is not -1)
			}               //so if condition will no more true so else condition will work 
			else {
				last = idx;

			}
		}
		findOccurence(str ,idx+1,element);//when base condition reaces it will print
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abaacdaefaaheteet";
		findOccurence(str,0,'e');

	}

}
