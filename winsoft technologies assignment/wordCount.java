// Q3:Write a Java Program to count the number of words in a string using HashMap.


import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String text = "My name is Shubham";
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = text.split("\\s+");
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
               
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
               
                wordCounts.put(word, 1);
            }
        }
        System.out.println("Word Counts:");
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}