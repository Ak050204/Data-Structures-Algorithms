package Programing.Sorting;

public class countingSorting {
public static void countingSort(int arr[]){
  int largest = Integer.MIN_VALUE;
  for(int i=0; i<arr.length; i++){
    largest = Math.max(largest, arr[i]);
  }
  int count[] = new int[largest+1];
  for(int i=0; i<arr.length; i++){
    count[arr[i]]++;
  }
  // sorting
  int j = 0;
  for(int i=0; i<count.length; i++){
    while(count[i] > 0){
      arr[j] = i;
      j++;
      count[i]--;
    }
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
    int arr[] = {5, 4, 1, 3, 2, 6, 7, 1, 9, 8, 3, 2, 5, 7, 3,6,4};
    countingSort(arr);
    printArray(arr);
  }
}
