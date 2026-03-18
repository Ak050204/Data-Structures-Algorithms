package Programing.Recursion;
public class sumNatural {
  public static int calcSum (int n){
    if(n==1){
      return 1;
    }
    int sum1 = calcSum(n-1);
    int su = n+ sum1;
    return su;
  }
  public static void main(String[] args) {
    int n = 10;
    System.out.println(calcSum(n));
  }
}

