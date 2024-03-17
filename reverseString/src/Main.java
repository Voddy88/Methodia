import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter a word:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(reverseString(input));
    }

    private static String reverseString(String input) {
        int stringLength = input.length();
        char[] reversedString = new char[stringLength];
        for (int i = 0; i < stringLength; i++) {
            reversedString[i] = input.charAt(stringLength - 1 - i);
        }
        return new String(reversedString);
    }
}