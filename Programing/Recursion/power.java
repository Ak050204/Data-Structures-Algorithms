package Programing.Recursion;

public class power {
  public static int pow(int x, int n){

  //   if(n == 0){
  //     return 1;
  //   }
  //   int xnm1 = pow(x, n-1);
  //   int xn = x * xnm1;
  //   return xn;
  // }

  if(n == 0){
    return 1;
  }
  int halfPower = pow(x, n/2);
  int halfPowerSq = halfPower * halfPower;

  // n is odd
  if(n%2 != 0){
    halfPowerSq = x * halfPowerSq;
  }
  return halfPowerSq;
}
  public static void main(String[] args) {
    int x = 2;
    int n = 25;
    System.out.println(pow(x, n));
  }
}
