package Project;
import java.util.*;
public class findvechicles {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int v = sc.nextInt();
    int w = sc.nextInt();

    int y = (w-2*v)/2;
    int x = v-y; 
    System.out.println(x + " " + y);
  }
}
