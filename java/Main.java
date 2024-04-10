public class Main {
  public static void main(String[] args) {
    int result = sum(3);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      System.out.println(k + sum(k - 1));
      return k + sum(k - 1);
    } else {
      System.out.println("out if");
      return 0;
    }
  }
}