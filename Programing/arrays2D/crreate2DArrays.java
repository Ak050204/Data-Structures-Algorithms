package Programing.arrays2D;

import java.util.Scanner;

public class crreate2DArrays {
  public static void main(String[] args) {
    int matrix[][] = new int [3][3]; // 3 rows and 3 columns
    int n = matrix.length; // number of rows
    int m = matrix[0].length; // number of columns

    // input
    Scanner sc = new Scanner(System.in);
    for(int i =0; i<n; i++){
      for(int j=0; j<m; j++){
        matrix[i][j] = sc.nextInt();
      }
    }
    // output
    for(int i=0; i<n; i++){
      for (int j=0; j<m; j++){
        System.out.print(matrix[i][j] + " ");
      }
       System.out.println();
    }
  }
}
