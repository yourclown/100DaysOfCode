import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    
    int n=scn.nextInt();
    int k=scn.nextInt();
    
    int same=k*1;
    int diff=k*(k-1);
    int total=same+diff;
    
    for(int i=3;i<=n;i++){
    same=diff*1;//this is the scenario where we have not more than 2 consecutive fence of same color and the last two of the same colour as well.
    diff=total*(k-1);//this is the scenario where we have not more than 2 consecutive fence of same color and the last two "are not" of the same colour as well. 
    total=same+diff;

    }
    
    System.out.println(total);
    
    }
}
