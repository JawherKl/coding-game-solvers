import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        //Split input by spaces
        String[] words = input.trim().split("\\s+");
        StringBuilder camelCase = new StringBuilder();

        for (int i = 0; i< words.length; i++) {
            String word = words[i].toLowerCase();
            if (i == 0) {
                //First word: all lowercase
                camelCase.append(word);
            } else {
                //Capitalize first letter, rest lowercase
                camelCase.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1));
            }
        }
        System.out.println(camelCase.toString());
    }
}
