//T(n)=O(n)
//At first it may seem like a while loop is running inside for loop, making the time complexity O(n^2).
//But this is not the case, the time complexity of this is O(n) only.
//Because the while loop inside for loop doesn't run n times. As we are pushing and popping each element of arr[] only once inside the stack.

//S(n)=O(n)
//An array of n size is used, making the space complexity O(n).
Because the while loop inside for loop doesn't run n times. As we are pushing and popping each element of arr[] only once inside the stack.
import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   int n=arr.length;
   int[]nge=new int[n];
   Stack<Integer>st=new Stack<Integer>();
   nge[n-1]=-1;
   st.push(arr[n-1]);
   for(int j=n-2;j>=0;j--){
    while(st.size()>0&&st.peek()<=arr[j]){
    st.pop();
    }
    if(st.size()==0){
    nge[j]=-1;
    }
    
    else{
    nge[j]=st.peek();
    }
    st.push(arr[j]);
 }
   return nge;
}
}
