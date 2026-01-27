package Programing.arrays;

public class MaxSubArrays {
  public static void maxSubArraySum(int arr[]){
    int maxSum = Integer.MIN_VALUE;
    for(int i=0; i < arr.length; i++){
      int start = i;
      for(int j = i; j < arr.length; j++){
        int end = j;
        int currentSum = 0;
        for(int k = start; k <= end; k++){
          currentSum += arr[k];
        }
        if(currentSum > maxSum){
          maxSum = currentSum;
        }
      }
    }
    System.out.println("Maximum Subarray Sum is: " + maxSum);
  }
  public static void main(String[] args) {
    int arr[] = {1, -2, 6, -1, 3};
    maxSubArraySum(arr);
  }
  
}
