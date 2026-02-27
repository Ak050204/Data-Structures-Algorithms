package Programing.Recursion;

public class factorial {
  public static int factorials(int n)
  {
    if(n == 0){
      return 1;
    }
    int fam1 = factorials(n-1);
    int fact = n * factorials(n-1);
    return fact;
  }
  public static void main(String[] args) {
    int n = 5;
System.out.println(factorials(n));
  }
}
