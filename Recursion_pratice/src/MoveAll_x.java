public class MoveAll_x {
    public static void moveall(String str, int idx, int count, String newstring) {
        
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newstring = newstring + 'x';
                
            }
            System.out.println(newstring);//In Java, the return; statement can be used within a void method 
            return;//to immediately exit the method and return control to the caller
        } 
            char currchar = str.charAt(idx);
            if (currchar == 'x') {
                count = count + 1;
                moveall(str, idx + 1, count, newstring);
            } else {
                newstring = newstring + currchar;
             
            moveall(str, idx + 1, count, newstring);
            }
        }
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "acxxrxv";
        moveall(str, 0, 0, "");
    }
}
