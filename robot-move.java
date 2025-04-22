import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String orders = in.nextLine().trim();
        String[] commands = orders.split("\\s+");

       // Mapping text commands to robot symbols
       Map<String, String> map = new HashMap<>();
       map.put("up", "^");
       map.put("down", "v");
       map.put("left", "<");
       map.put("right", ">");

       StringBuilder result = new StringBuilder();
       String prev = "";
       int count = 0;

       for (int i =0; i< commands.length; i++) {
        String current = commands[i];
        if (current.equals(prev)) {
            count++;
        } else {
            if (!prev.isEmpty()){
                result.append((map.get(prev)));
                if(count>1){
                    result.append(count);
                }
            }
            prev = current;
            count=1;
        }
       }
       if(!prev.isEmpty()){
        result.append(map.get(prev));
        if(count>1){
            result.append(count);
        }
       }

        System.out.println(result.toString());
    }
}
