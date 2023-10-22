import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

//Create a Stack
//Iterate through the whole string.
//Keep on pushing elements in stack and increasing n(the next number to be pushed in the Stack) until we find an 'i'.
//Whenever you find an 'i', push the n in the stack and then pop out all the elements
//After the iteration ends, push the next n and pop out the remaining elements out of the Stack.

    Stack<Integer>st=new Stack<>();
    int n=1;
    for(int i=0;i<str.length();i++){ 
    if(str.charAt(i)=='d'){ 
        st.push(n);
        n++;
    }
    
    else{
        st.push(n);
        n++;
        while(st.size()>0){
            System.out.print(st.pop());
        }
    }
    }
    st.push(n);
    while(st.size()>0){
            System.out.print(st.pop());
           
        }
 }
}
