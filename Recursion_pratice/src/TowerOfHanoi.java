//TowerOfHanoi
public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n >0) {
        //	  System.out.println("Transfer disk " + n + " from " + src + " to " + dest);;
        //    return;
      //  }
        //  else{
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
        
    }}

    public static void main(String[] args) {
        int n = 1;
        towerOfHanoi(n, "S", "H", "D");
    }
}
