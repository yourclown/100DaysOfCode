import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int[]qb=new int[n+1];
       System.out.println(Climbst(n,qb));
    }
    
    public static int Climbst(int n,int[]qb){
    
    if(n==0){   //if we are at the 0th stair, there is one possible move(don't move)
    return 1;
    }
    else if(n<0){   //if we are below the 0th stair, there is not possible move.
    return 0;
    }
    
    if(qb[n]>0){    //we check if the call value is already in the quesion bank (qb)
    return qb[n];
    }
    
    int s1=Climbst(n-1,qb);
    int s2=Climbst(n-2,qb);
    int s3=Climbst(n-3,qb);
    int tp=s1+s2+s3;
    
    qb[n]=tp;
    return tp;
    }

}
