package Programing.string;

public class palindrome {
  public static boolean isPalindrome(String str) {
    for(int i= 0; i<str.length()/2; i++){
      if(str.charAt(i) != str.charAt(str.length()-1-i)){
        // not a palindrome
        return false;
      }
    }
    // is a palindrome
    return true;
  }
  public static void main(String[] args) {
    String str = "noon";
    if(isPalindrome(str)){
      System.out.println(str + " is a palindrome");
    } else {
      System.out.println(str + " is not a palindrome");
    }
  }
}
