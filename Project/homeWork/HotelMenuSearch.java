package Project.homeWork;

public class HotelMenuSearch {
  public static int linearSearch(String menu[], String searchItem) {
    for(int i=0; i<menu.length; i++){
      if(menu[i] == searchItem){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    String menu[] = {"Pasta", "Burger", "Pizza", "Salad", "Soup", "Steak", "Sandwich", "Fries", "Ice Cream", "Soda", "Coffee", "Tea", "Juice", "Cake", "Pie", "Taco", "Burrito", "Nachos", "Wings", "Wrap"};
    String searchItem = "Pizza";

    int index = linearSearch(menu, searchItem);
    if(index != -1){
      System.out.println(searchItem + " is available at index: " + index);
    } else {
      System.out.println(searchItem + " is not available in the menu.");
    }
  }
}

    
  