package Programing.Oops;

public class Inheritance {
  public static void main(String[] args) {
    Fish shark = new Fish();
    shark.eat();
  }
  }
  // base class
  class Animal {
    void eat() {
      System.out.println("Eating...");
    }
    void breathe() {
      System.out.println("Breathing...");
    }
  }
  // derived class
  class Fish extends Animal {
    void swim() {
      System.out.println("Swimming...");
    }
  }

