package stacks_and_queues;


import java.io.*;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int[]a=new int[n1];
    
    for(int i=0;i<n1;i++) {
    	a[i]=scn.nextInt();
    }
    
    Arrays.sort(a);
    for(int i=1;i<n1;i++) {
    	if(a[i]==a[i-1]) {
    		System.out.println("true");
    		System.exit(0);
    	}
    	
    }
    System.out.println("false");
    
    
    }
}
