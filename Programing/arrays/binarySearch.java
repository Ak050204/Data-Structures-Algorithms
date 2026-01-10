package Programing.arrays;

public class binarySearch {

  public static int binarySearch(int arr[], int key){
    int start = 0;
    int end = arr.length - 1;
    while(start <= end){
      int mid = (start + end)/2;
      //compare key with mid
      if(key == arr[mid]){
        return mid;
      }
      if(key < arr [mid]){
        end = mid - 1;  //search in left half
      }
      else{
        start = mid + 1; //search in right half
      }
    }
    return -1; //key not found
  }
  public static void main(String[] args) {
    int arr[] = {2, 4, 6, 8, 10, 12, 14};
    int key = 100;
    int result = binarySearch(arr, key);
    if(result == -1){
      System.out.println("Element not found in the array");
    }
    else{
      System.out.println("Element found at index: " + result);
    }
  }
  
}
