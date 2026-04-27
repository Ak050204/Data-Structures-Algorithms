package Programing.Backtracking;

public class Subset {
  public static void findSubset(String str, String ans, int i){
    // base case
    if(i == str.length()){
      if(ans.length() == 0){
        System.out.print("null ");
      }
      System.out.print(ans+" ");
      return;
    }
  

    // recursion
    // yes
    findSubset(str, ans+str.charAt(i), i+1);
    // no 
    findSubset(str, ans, i+1);

  }
  public static void main(String[] args){
    String str = "abc";
    findSubset(str, "", 0);
  }
}
