import java.io.*;
import java.util.*;

public class Main {

	  	public static void main(String[] args) throws Exception {
	  	Scanner sc=new Scanner(System.in);
	  	String s=sc.nextLine();//read difference between next() and nextLine()
	    Stack<Character>st=new Stack<Character>();
	   	for(int i=0;i<s.length();i++) {
	   	char ch=s.charAt(i);
	   	if(ch==')') {
	   		if(st.peek()=='(') {
	   		System.out.println(true);
	   		return;
	   		}	
	   	
	   	
	   	else {
	   		while(st.peek()!='(') {
	   			st.pop();
	   		}
	   		st.pop();
	   		
	   	}
	   	}
	   	else {
	   		st.push(ch);
	   	}
	   	}
	   	
	   	System.out.println(false);
	   	
	    }

}
