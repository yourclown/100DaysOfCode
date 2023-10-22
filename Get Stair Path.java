import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList < String > paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList < String > getStairPaths(int n) {
        if (n == 0) {
            ArrayList < String > bans = new ArrayList < String > ();
            bans.add("");
            return bans;
        }

        if (n < 0) {
            ArrayList < String > bans = new ArrayList < String > ();
            return bans;
        }

        ArrayList < String > nm1to0 = getStairPaths(n - 1); //n-1 to 0
        ArrayList < String > nm2to0 = getStairPaths(n - 2); //n-2 to 0
        ArrayList < String > nm3to0 = getStairPaths(n - 3); //n-3 to 0

        ArrayList < String > nto0 = new ArrayList < > ();

        //n to 0 ->  '1' + n-1 to 0
        for (String path: nm1to0) {
            nto0.add(1 + nto0);
        }

        //n to 0 -> '2' + n-2 to 0
       for (String path: nm2to0) {
            nto0.add(2 + nto0);
        }

        //n to 0 -> '3' + n-3 to 0
           for (String path: nm3to0) {
            nto0.add(3 + nto0);
        }

        return nto0;

    }

}
