import java.util.*;
public class MultidimensionalArray {
  public static void main(String[] args) {
  ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
ArrayList<Integer> List1 = new ArrayList<>();
List1.add(1); List1.add(2); List1.add(3);
mainList.add(List1);

ArrayList<Integer> List2 = new ArrayList<>();
List2.add(4); List2.add(5); List2.add(6);
mainList.add(List2);

System.out.println(mainList);
for(int i=0; i<mainList.size(); i++){
  ArrayList<Integer> currList = mainList.get(i);
  for(int j = 0; j<currList.size(); j++){
    System.out.print(currList.get(j) + " ");
  }
  System.out.println();
  }

 }
}
