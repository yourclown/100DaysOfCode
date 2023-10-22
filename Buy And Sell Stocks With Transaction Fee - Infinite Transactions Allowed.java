//the main thing to remember here is that we have to avoid overlapping transactions.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
        }
        int fee=scn.nextInt();
        int obsp= -arr[0]; //this is the scenario where we have one unsold ticket.
        int ossp= 0;//this is the scenario where we don't have any unsold tickets(bought=sold)
        
        for(int i=1;i<n;i++){
            
        int nbsp=0;
        int nssp=0;
        if(obsp<ossp-arr[i]){
        nbsp=ossp-arr[i];
        }
        
        else{
        nbsp=obsp;
        }
        
        if(ossp<obsp+arr[i]-fee){
        nssp=obsp+arr[i]-fee;
        }
        
        else{
        nssp=ossp;
        }
        
        ossp=nssp;
        obsp=nbsp;
        }
        System.out.println(ossp);
    }

}
