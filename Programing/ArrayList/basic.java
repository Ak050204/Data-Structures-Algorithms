import java.util.ArrayList;
public class basic {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // Add opration
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);

    // get opration O(1)
    int element = list.get(2);
    System.out.println(element);

    // remove opration O(n)
    list.remove(2);
    System.out.println(list);

    // set opration O(n)
    list.set(2, 10);
    System.out.println(list);

    // contains opration O(n)
    System.out.println(list.contains(10));
    System.out.println(list.contains(3));
    System.out.println(list.size());
  }
}
