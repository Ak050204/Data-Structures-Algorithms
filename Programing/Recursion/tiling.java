package Programing.Recursion;

public class tiling {
  public static int tilingProblem(int n){//2*n (floor size)
    // varticle choice
    int fnm1 = tilingProblem(n-1);
    // horizontal choice
    int fnm2 = tilingProblem(n-2);
    int totalWays = fnm1 + fnm2;
    return totalWays;

  }
  public static void main(String[] args) {
    System.out.println(tilingProblem(4));
  }
}
