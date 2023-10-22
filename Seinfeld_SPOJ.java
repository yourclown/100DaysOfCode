import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
		int t=1;
		while(t!=0)
		{
		
		String s=scn.next();
		if(s.charAt(0)=='-') {
		break;
		}
		Stack<Character>st=new Stack<>();

		for(int j=0;j<s.length();j++){
		
		char ch=s.charAt(j);
		if(ch=='{') {
		st.push(ch);	
		}
		
		else{
			if(st.size()>0) {
				if(st.peek()=='{') {
					st.pop();
					}
					
					else {
					st.push(ch);
					}
					}
			else {
				st.push(ch);
			}
		}
		}
		int s1=0,s2=0;
		while(st.size()>0)
        {
            if(st.peek()=='}')
            s2++;
            else
            s1++;
            st.pop();
        }
		if(s1%2==0 &&s2%2==0) {
			System.out.println(t+". "+ (s2+s1)/2);		
			}
		else {
			System.out.println(t+". "+ ((s2+s1)/2+1));
		}
		
		t++;
		}
	}
}
