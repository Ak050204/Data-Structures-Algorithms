package Programing.string;

public class stringCompression {
  public static String compression(String str){
    int n = str.length();
    StringBuilder sb = new StringBuilder(" ");
   for(int i=0; i<n; i++){
    Integer count = 1;
    while(i<n-1 && str.charAt(i) == str.charAt(i+1)){
      count++;
      i++;
    }
    if(count > 1){
      sb.append(str.charAt(i));
      sb.append(count);
    }else{
      sb.append(str.charAt(i));
    }
   } 
   return sb.toString();
  }
  public static void main (String args []){
    String str = "aaabbbbbbcccdeeeffggggh";
    System.out.println(compression(str));
  }
}
