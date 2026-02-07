package Programing.string;
import java.util.*;
public class strings {
  public static void main(String[] args) {
    char arr[] = {'h', 'e', 'l', 'l', 'o'};
    String str = "abcd abcd";
    String str2 = new String("hello");
    // String is immutable, so we cannot change the value of str

    Scanner sc = new Scanner(System.in);
    String name;
    name = sc.nextLine();
    System.out.println(name);

    //  Sting length
    System.out.println(str.length());
    System.out.println(name.length());
    
    // concatination
    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
  }
}
