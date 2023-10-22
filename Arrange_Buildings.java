import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    long n=scn.nextInt(); //we use long for all variables as the given contraints are 45(which is BIG)
    
    long ocs=1;
    long ocb=1;
    
    for(int i=2;i<=n;i++){
    long ncb=ocs;
    long ncs=ocs+ocb;
    
    ocs=ncs;
    ocb=ncb;
    
    }
    System.out.println((ocs+ocb)*(ocs+ocb));
 }

}
////
