import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int MMM = in.nextInt();
        int AAA = in.nextInt();
        int NNN = in.nextInt();

        // Total Cost
        int totalCost = MMM * NNN * ( NNN + 1 ) / 2;
        int borrow = totalCost - AAA;

        System.out.println(Math.max(borrow, 0));
    }
}
