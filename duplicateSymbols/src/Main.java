import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Character> characters = new HashSet<>();
        Set<Character> duplicateCharacters = new HashSet<>();

        System.out.println("Please enter a word:");
        String word = scanner.nextLine();
        findDuplicatedCharacters(word, characters, duplicateCharacters);
        if (duplicateCharacters.isEmpty()) {
            System.out.println("There is no duplicated character!");
        } else {
            System.out.println("Duplicated characters are:");
            duplicateCharacters.forEach(element -> System.out.print(element + " "));
        }
    }

    private static void findDuplicatedCharacters(String word, Set<Character> characters, Set<Character> duplicateCharacters) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char currChar = word.charAt(i);
            if (!characters.add(currChar)) {
                duplicateCharacters.add(currChar);
            } else {
                characters.add(currChar);
            }
        }
    }
}