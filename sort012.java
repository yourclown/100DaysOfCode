import java.io.*;
import java.util.*;

public class Main {

  public static void sort012(int[] arr){
      //array partitioning or (2-Pointer) approach
  int i=0, j=0, k=arr.length-1;
  while(i<=k){
    if(arr[i]==0){
    swap(arr,i,j);
    i++;
    j++;//j always points towards the first '1' and only swaps with a '0'.
    }

    if(arr[i]==1){
    i++; //when we see arr[i]=1, we just move i one value ahead.
    }

    if(arr[i]==2){
    swap(arr,i,k); //when we see arr[i]=2, we decrease k so as to maintain the 2 pointer condition.
    k--;
    }
  }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort012(arr);
    print(arr);
  }

}
