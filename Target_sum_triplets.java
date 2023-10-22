package time_and_space;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_Triplets {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		    int n1=scn.nextInt();
		    int[]a=new int[n1];
		    
		    for(int i=0;i<n1;i++) {
		    	a[i]=scn.nextInt();
		    }
		    int tar=scn.nextInt();
		 
		    Arrays.sort(a);//n logn
		    
		    
		    for(int i=0;i<n1-1;i++) {
		    int ntar=tar-a[i];
		    int j=i+1;
		    int k=a.length-1;
		    while(i<j) {
		    	if((a[k]+a[j])>ntar) {
		    	k--;
		    	}
		    	
		    	else if((a[k]+a[j])<ntar) {
		    	j++;
		    	}
		    	
		    	else{
		    	System.out.println(a[i]+" "+a[j]+" "+a[k]);
		    	j++;
		    	k--;
		    	}
		    }
		    
		    }

	}

}
