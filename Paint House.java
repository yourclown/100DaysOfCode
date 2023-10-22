import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
          int n=scn.nextInt();
          int[][] costs= new int[n][3];
          for(int i=0;i<n;i++){
              for(int j=0;j<3;j++){
                  costs[i][j]=scn.nextInt();
              }
          } 
          
        int[][]dp=new int[n][3]; 
         dp[0][0]=costs[0][0];
         dp[0][1]=costs[0][1];
         dp[0][2]=costs[0][2];

        
        for(int i=1;i<costs.length;i++){
        //every element in a row is the minimum of the other colours in the prev row+ the element itself
        dp[i][0]=costs[i][0]+Math.min(dp[i-1][1],dp[i-1][2]);//red colour
        dp[i][1]=costs[i][1]+Math.min(dp[i-1][0],dp[i-1][2]);//blue colour
        dp[i][2]=costs[i][2]+Math.min(dp[i-1][0],dp[i-1][1]);//green colour
        }
        
        int ans=Math.min(Math.min(dp[n-1][0],dp[n-1][1]),dp[n-1][2]);
         System.out.println(ans);
    }
}
