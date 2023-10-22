import java.io.*;
import java.util.*;
//
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
        }
        
        int lsf=Integer.MAX_VALUE;
        int op=0; // OP => Overall Price
        int pist=0;//pist => Price If Sold Today
        
        
        for(int i=0;i<n;i++){
        if(arr[i]<lsf){  //we have to buy the stock at minimum price for max profit. 
        lsf=arr[i];
        }
        
        pist=arr[i]-lsf;
        
        if(op<pist){
        op=pist;
        }
        }
        System.out.println(op);
    }

}
