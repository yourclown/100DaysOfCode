import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<arr.length;i++){
    arr[i]=scn.nextInt();
    }
    int ans=maxsum(arr);
    System.out.println(ans);
    }
    
    public static int maxsum(int[]arr){
    int inc=0;
    int exc=0;
    
    for(int i=0;i<arr.length;i++){
    int ninc=arr[i]+exc;    //since an incllude sum can only be built on an excluded element, we add the  current element to the previous exluded element.
    
    int nexc=Math.max(inc,exc); //if the previous element is included, then both the possiblities are open for the current element. Hence, we pick the greatest of the two.
    
    inc=ninc;
    exc=nexc;
    }
    return Math.max(inc,exc);
    }
}
