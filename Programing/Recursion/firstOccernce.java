package Programing.Recursion;

public class firstOccernce {
  public static int firstOcc(int arr[], int target, int i){
    if(i == arr.length-1){
      return -1;
    }
    if(arr[i] == target){
      return i;
    }
    return firstOcc(arr, target, i+1);
  }
  public static void main(String[] args) {
    int arr[] = {1, 3, 5, 6, 7, 5, 8, 9};
    int target = 1;
    System.out.println(firstOcc(arr, target, 0));
  }
}
