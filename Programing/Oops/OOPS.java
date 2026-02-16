package Programing.Oops;

public class OOPS {
  public static void main(String[] args) {
    Pen p1 = new Pen(); //Created a pen object called p1
    p1.setColor("Blue");
    System.out.println("Pen color: " + p1.getColor());
    p1.setTip(5);
    System.out.println("Pen tip: " + p1.getTip());
    p1.setColor("Red");
    System.out.println("Pen color: " + p1.getColor());

    // BankAccount myAcc = new BankAccount();
    // myAcc.username = "GAK351";
    // myAcc.password = "12345"; // This will give an error because password is private
  }
}
class Pen {
  // Properties
  private String color;
  private int tip;
// function
String getColor(){
  return this.color;
}
int getTip(){
  return this.tip;
}
  void setColor(String newColor){
    color = newColor;
  }
  void setTip(int newTip){
    tip = newTip;
  }
}

class Student {
  String name;
  int age;
  float percentage;

  // function
  void calcPercentage(int totalMarks, int marksObtaoned){
    percentage = marksObtaoned * 100 / totalMarks;
  }
}

class BankAccount {
  public String username;
  private String password;
  public void setPassword(String pwd){
    password = pwd;
  }

}