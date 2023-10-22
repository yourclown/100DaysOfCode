//Time Complexity:O(n): Every element will be pushed into the stack once. Also, there is just one time that the element will be popped. Because once popped it is lost from the stack. So every element has two events associated with itself. One push and just one pop. Both are constant-time operations. When we do the same for n elements we will have n*O(1) i.e O(n) operations. Hence the time complexity is O(n).

//Space Complexity:O(n): We are using an auxiliary stack which in the worst case will be fully filled with n numbers.
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

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   int n=arr.length;
   int[]stsp=new int[n];
   Stack<Integer>st=new Stack<>();
   stsp[0]=1;
   st.push(0);//push the first element's index.
   for(int i=1;i<n;i++){
   while(st.size()>0 && arr[i]>arr[st.peek()]){ //Until we find an element greater than arr[i], we pop
    st.pop();
   }
   if(st.isEmpty()){ //if all the elements are popped out, that means there are no days before i with                           higher stock price.
    stsp[i]=i+1;
   }
   
   else{
    stsp[i]=i-st.peek(); //if there is an element less than arr[i], 
                        //stockspan=i(current element)-st.peek(previous greater)
   }
   
   st.push(i);//push the current element.
   }
   return stsp;
 }

}
