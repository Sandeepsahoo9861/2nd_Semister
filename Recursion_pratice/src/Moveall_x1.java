//we want to move all x to right sight side from a string
public class Moveall_x1 {
    public static void moveall(String str, int idx, String var, String newstring) {
        
        if (idx == str.length()) {
            // No need for loop here
            // Append 'var' to 'newstring' after traversing the entire string
            newstring = newstring + var;
            System.out.println(newstring);
            return;
        } 
        char currchar = str.charAt(idx);
        if (currchar == 'x') {
            // Append 'currchar' to 'var' instead of concatenating 'var' directly
            var = var + currchar;
        } else {
            // Append 'currchar' directly to 'newstring'
            newstring = newstring + currchar;
        }
        // Recursive call with updated 'idx', 'var', and 'newstring'
        moveall(str, idx + 1, var, newstring);
    }

    public static void main(String[] args) {
        String str = "acxxrxv";
        moveall(str, 0, "", ""); // Start with an empty 'var' and 'newstring'
    }
}
