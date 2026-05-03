import java.util.*;
public class FindMax {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(3);
    list.add(6);
    list.add(9);
    list.add(7);
    System.out.println(list);

    int max = Integer.MIN_VALUE;
    for(int i = 0; i<list.size(); i++){
      if(list.get(i) > max){
        max = list.get(i);
      }
    }
    System.out.println("Max element in the list is:"+ max);
  }
}
