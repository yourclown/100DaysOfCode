import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();

int[]dp0=new int[n+1];  //every element contains count of binary strings of length i and ending with 0.
int[]dp1=new int[n+1];  //every element contains count of binary strings of length i and ending with 1.

dp0[1]=1; //the only possible binary string of length 1 wnding with 0 is "0".
dp1[1]=1; //the only possible binary string of length 1 wnding with 1 is "1".

for(int i=2;i<=n;i++){
dp0[i]=dp1[i-1];
dp1[i]=dp0[i-1]+dp1[i-1];
}

System.out.println(dp0[n]+dp1[n]);
 }

}
