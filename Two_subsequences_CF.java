import java.util.*;


public class TwoSubsequences {

public static void main(String[] args) throws Exception {
	
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	
	while(n>0) {
		
	
	String str=scn.nextLine();
	if(str.length()>0) {
		char[]s=str.toCharArray();
		StringBuilder sb = new StringBuilder(str);
		int z='z';//store maximum ASCII value (of Z) in a char z.
		int idx=0;
		for(int j=0;j<str.length();j++) {

		if(s[j]<z) {
		z=s[j];
		idx=j;
		}

		}
		char ans1= (char)z;	
		sb.deleteCharAt(idx);
		System.out.println(ans1+" "+sb);
		n--;	
	}

	}
	}


}
