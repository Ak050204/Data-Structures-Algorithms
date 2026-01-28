package Project.homeWork;

public class sort {
  public static void bubbleSort(int arr[]){
    int n = arr.length;
    for(int turn = 0; turn < n-1; turn++){
      for( int j = turn + 1; j < n-1; j++){
        if(arr[turn]>arr[j]){
          // swap
          int temp = arr[turn];
          arr[turn] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
  public static void selectionSort(int arr[]){
    int n = arr.length;
    for(int turn = 0; turn < n-1; turn++ ){
      int minIndex = turn;
      for(int j = turn + 1; j < n; j++){
        if(arr[minIndex]>arr[j]){
          minIndex = j;
        }
      }
      // swap
      int temp = arr[turn];
      arr[turn] = arr[minIndex];
      arr[minIndex] = temp;
      }
      public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
          int current = arr[i];
          int j = i - 1;
          while(j >= 0 && arr[j] > current){
            arr[j + 1] = arr[j];
            j--;
          }
          arr[j + 1] = current;
        }
      }
   }
  // print array
  public static void printArray( int arr[]){  
    int n = arr.length;
    for(int i = 0; i < n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
    // bubbleSort(arr);
    selectionSort(arr);
    printArray(arr);

  }
}
