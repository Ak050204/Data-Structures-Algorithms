package Programing.string;

public class charAtMethod {
  public static void printLetters(String str){
    for(int i=0; i<str.length(); i++){
      System.out.print(str.charAt(i) + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    String str = "hello";
    String str2 = "Gayatri";
    String fullstr = str + " " + str2;
    printLetters(fullstr);
  }
}
