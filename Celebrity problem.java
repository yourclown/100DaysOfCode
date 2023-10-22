import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }


    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it''s index (not position), if there is not then
        // print "none"
        Stack<Integer>st=new Stack<>(); //we push all the people(indexes) in a stack.
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }
        
        while(st.size()>=2){
         int i=st.pop();
         int j=st.pop();
         if(arr[i][j]==1){ //i knows j, i can't be a celeb
             st.push(j);
         }
         else{
             st.push(i);
         }
        }
        
        int pc=st.pop(); //last emaining element in stack is potential celebrity(PC).
        
        //row check
        for(int k=0;k<arr.length;k++){
            if(pc!=k&&arr[pc][k]==1){//pc!=k coz pc khud ko jaane ya na jaane, usse koi farak nahi padta.
                System.out.println("none");
                return;
            }
        }
        
        for(int k=0;k<arr.length;k++){
            if(pc!=k&&arr[k][pc]==0){
                System.out.println("none");
                return;
            }
        }
        System.out.println(pc);

}

}
