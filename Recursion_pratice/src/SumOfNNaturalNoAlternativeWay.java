public class SumOfNNaturalNoAlternativeWay {

  public static int sumOfNNaturalNoAlternativeWay(int n, int sum) {
    if (n == 0) {
      return sum;
    }
    return sumOfNNaturalNoAlternativeWay(n - 1, sum + n);
  }

  public static void main(String[] args) {
    int sum = sumOfNNaturalNoAlternativeWay(5, 0);
    System.out.println(sum);
  }
}
