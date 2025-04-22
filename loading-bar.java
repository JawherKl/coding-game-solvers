import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        int L = in.nextInt();
        float PROG = in.nextFloat();

        //Calculate how many "full" and "empty" symbols
        int fullLength = (int) Math.ceil(L * PROG);
        int emptyLength = L - fullLength;

        //Build and print the loading bar
        StringBuilder bar = new StringBuilder();
        for (int i = 0; i < fullLength; i++) {
            bar.append(A);
        }
        for (int i=0; i < emptyLength; i++) {
            bar.append(B);
        }
        System.out.println(bar.toString());

    }
}
