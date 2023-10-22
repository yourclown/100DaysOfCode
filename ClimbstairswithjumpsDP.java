import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[]jumps = new int[n];
        
        for(int i=0; i < jumps.length;i++) {
            jumps[i] = scn.nextInt();
        }
        
        int ways = CSVJ_tab(jumps,n);
        
        System.out.println(ways);
    }
    
    public static int CSVJ_tab(int[]arr,int n){
    int[]dp=new int[n+1];
    dp[n]=1;
    for(int i=n-1;i>=0;i--){
    for(int j=1;j<=arr[i] && i+j<dp.length;j++){
    dp[i]+=dp[i+j];
    }
    }
    return dp[0];
    }
    

}
