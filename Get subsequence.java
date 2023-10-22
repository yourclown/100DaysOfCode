import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        ArrayList<String> ss = gss(str);
        System.out.println(ss);

    }

    public static ArrayList<String> gss(String str) {
        
        // base condition
        if(str.length() == 0){
            // base ans
            ArrayList<String>bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        
        // taking the 1st char out 
        char ch = str.charAt(0);
        
        // getting rest of the string
        String ros = str.substring(1);
        
        // calling faith => ss for rest of string
        ArrayList<String>rans = gss(ros);
        
        // ss for current string dealing with
        ArrayList<String>myans = new ArrayList<>();
        
        // adding prev sub string arraylist as it is
        for(int i=0; i<rans.size(); i++){
            myans.add(rans.get(i));
        }
        
        // adding my first char to each elem of rans
        for(int i=0; i<rans.size(); i++){
            myans.add(ch + rans.get(i));
        }
        
        return myans;
    }

}
