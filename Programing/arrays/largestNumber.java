package Programing.arrays;

public class largestNumber {
  public static int largestNumber(int arr[]){
    int Largest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      if (arr[i]> Largest){
        Largest = arr[i];
      }
    }
    return Largest;
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 6, 3, 5,4, 9, 7};
    System.out.println("The largest number in the array is: " + largestNumber(arr));
  }
}
