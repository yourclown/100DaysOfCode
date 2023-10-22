import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int[]qb=new int[n+1];   //we make and pass a "question bank" qb array in which it stores the call
                            // values ofthe numbers so that we can use them if called again.
    System.out.println(Fibdp(n,qb));
    
 }
 
public static int Fibdp(int n, int[]qb){
    if(n==0||n==1){
    return n;
    }
    
    if(qb[n]!=0){   //since the qb array is "all zero". Hence, if an element is non-0, it means it has                       stored the call value
    return qb[n];
    }
    
    int fibnm1=Fibdp(n-1,qb);
    int fibnm2=Fibdp(n-2,qb);
    int fibn=fibnm1+fibnm2;
    
    qb[n]=fibn;
    return fibn;
}

}
