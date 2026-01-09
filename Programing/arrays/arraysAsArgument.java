package Programing.arrays;
import java.util.*;

public class arraysAsArgument {
  public static void updateArray(int marks[]) {
    for(int i=0; i<marks.length; i++){
      marks[i] = marks[i] + 2; // add 2 marks to each subject
    }
  }
  public static void main(String[] args) {
    int marks[] = {85, 90, 95};
    updateArray(marks);

    // Print updated marks
    for(int i=0; i<marks.length; i++){
      System.out.println(marks[i]+ "");
    }
    System.out.println(); // for new line
  }
}
