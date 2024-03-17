import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> words = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a text:");
        String text = scanner.nextLine();
        System.out.println(countTheWordsInAText(text, words));
    }

    private static int countTheWordsInAText(String text, Map<String, Integer> words) {
        String[] splittedWords = text.split("[\\s.?]+|[.,?!]");
        for (String word : splittedWords) {
            word = word.toLowerCase();
            if (!words.containsKey(word)){
                words.put(word,1);
            }else{
                words.put(word,words.get(word)+1);
            }
        }
        return words.values().stream().mapToInt(Integer::intValue).sum();
    }
}