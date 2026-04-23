package Programing.Recursion;

public class removeDuplicates {
  public static void removeDup(String str, int idx, StringBuilder newStr, boolean map[]){
    if(idx == str.length()){
      System.out.println(newStr);
      return;
    }
    // kaam
    char currChar = str.charAt(idx);
    if(map[currChar-'a'] == true){
      // duplicate
      removeDup(str, idx+1, newStr, map);
    }else {
      // not duplicate
      newStr.append(currChar);
      map[currChar-'a'] = true;
      removeDup(str, idx+1, newStr, map);
    }
  }
  public static void main(String[] args){
    String str = "aniketbalasahebkandekar     ";
    // boolean[] map = new boolean[26];
    removeDup(str, 0, new StringBuilder(""), new boolean[26]);
  }
}
