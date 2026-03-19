package Programing.Recursion;

public class lastOccurence {
  public static int lastOcc(int arr[], int target, int i){
    if(i == 0){
      return -1;
    }
    if(arr[i] == target){
      return i;
    }
    return lastOcc(arr, target, i-1);
  }
  public static void main(String[] args) {
    int arr[] = {1, 3, 5, 6, 7, 5, 8, 9, 7};
    int target = 7;
    System.out.println(lastOcc(arr, target, arr.length-1));
  }
}
