import java.util.*;

public class Sort {

  public static void main(String[] args) {
    ArrayList<Integer> List = new ArrayList<>
();
    List.add(5);
    List.add(3);
    List.add(1);
    List.add(4);
    List.add(2);
    System.out.println(List);
    // Collections.sort(List); // asending
    // System.out.println(List);

    // desending
    Collections.sort(List, Collections.reverseOrder());
    // Collections.reverse(List);
    System.out.println(List);


  }
}
