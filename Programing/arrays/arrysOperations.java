package Programing.arrays;
import java.util.*;
public class arrysOperations {
  //their are 4 operations in arrays input, output, update, delete
  public static void main(String[] args) {
    int marks[] = new int[50];
    Scanner sc = new Scanner(System.in);
    // int physics = sc.nextInt();
    // marks[0] = physics; 
    marks[0] = sc.nextInt();//phy
    marks[1] = sc.nextInt();//chem
    marks[2] = sc.nextInt();//math

    System.out.println("phy marks: " + marks[0]);
    System.out.println("chem marks: " + marks[1]);
    System.out.println("math marks: " + marks[2]);

    marks[2] = 95; // Update marks
    System.out.println("Updated math marks: " + marks[2]);
  }
}
