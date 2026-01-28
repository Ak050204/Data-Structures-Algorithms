package Programing.Sorting;

public class selectionSorting {
  public static void selectionSort(int arr[]){
    int n = arr.length;
    for(int i = 0; i < n-1; i++){
      // find the min element in unsorted array
      int minIdx = i;
        for(int j = i+1; j < n; j++){
         if(arr[j] < arr[minIdx]){
          minIdx = j;
         }
          }
          // swap the found min element with the first element
          int temp = arr[minIdx];
          arr[minIdx] = arr[i];
          arr[i] = temp;
        }
    }
  // print array
  public static void printArray(int arr[]){
    for( int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = {5, 4, 1, 3, 2, 6, 7, 1, 9, 8};
    selectionSort(arr);
    printArray(arr);
  }
}
