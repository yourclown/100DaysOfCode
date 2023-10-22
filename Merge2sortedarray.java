import java.io.*;
import java.util.*;
public class Main {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    int[]merge=new int[a.length+b.length];
    
    int i=0;
    int j=0;
    int k=0;
    
    while(i<a.length&&j<b.length){
    if(a[i]<=b[j]){
    merge[k]=a[i];
    i++;
    k++;
    }
    
    else{
    merge[k]=b[j];
    j++;
    k++;
    }
    
    }
    
    while(i<a.length){ //Caution Loop 1
    merge[k]=a[i];
    i++;
    k++;
    }
    
    while(j<b.length){ //Caution Loop 2
    merge[k]=b[j];
    j++;
    k++;
    }
    
    // These are called "Caution Loops" because these loops run when either loops are         traversed completely and the other has a few elements remaining.
    return merge;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}
