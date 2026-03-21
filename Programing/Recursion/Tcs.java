import java.util.*;
package Programing.Recursion;

public class Tcs {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<String>seen = new HashSet<>();
    int prevTime = -1;
    for(int i = 0; i<N; i++){
      String Sender = sc.next();
      String Reciver = sc.next();
      int Timestamp = sc.nextInt();
      int amount = sc.nextInt();

      String key = Sender +"-"+ Reciver;
      if(seen.contains(key)){
        System.out.print("Error: Duplicates");
        return;
      }
      seen.add(key);
      if(prevTime != -1 && (Timestamp - prevTime > 60)) {
        System.out.print("Fraud detection");
        return;
      }
      prevTime = Timestamp;
    }
    System.out.print("all transaction valid");
  }
}
