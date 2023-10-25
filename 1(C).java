// Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
//from a-z)

import java.util.HashSet;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "today is a sunny day but it might rain";
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        s = s.toLowerCase();

        HashSet<Character> letterSet = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letterSet.add(c);
            }
        }

        return letterSet.size() == 26; 
    }
}
