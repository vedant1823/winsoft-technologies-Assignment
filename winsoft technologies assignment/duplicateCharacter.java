//Q4:Write a Java Program to find the duplicate characters in a string.
import java.util.HashMap;

public class Problem4 {
    public static void main(String[] args) {
        String str = "shubham";
        String duplicates = findDuplicateCharacters(str);
        System.out.println("Duplicate characters in the string: " + duplicates);
    }
    public static String findDuplicateCharacters(String str) {
        
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            
            if (c != ' ') {
                
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        StringBuilder duplicates = new StringBuilder();
        for (char c : charFrequencyMap.keySet()) {
            if (charFrequencyMap.get(c) > 1) {
                duplicates.append(c);
            }
        }

        return duplicates.toString();
    }
}