import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Total characters
        int characters = sentence.length();

        // Total words
        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        // Uppercase and lowercase
        String upper = sentence.toUpperCase();
        String lower = sentence.toLowerCase();

        // Reverse sentence
        String reverse = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reverse += sentence.charAt(i);
        }

        // Count vowels and consonants
        int vowels = 0;
        int consonants = 0;

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Palindrome check
        String clean = sentence.replaceAll("\\s+", "");
        String reversedClean = "";

        for (int i = clean.length() - 1; i >= 0; i--) {
            reversedClean += clean.charAt(i);
        }

        String palindrome;

        if (clean.equals(reversedClean)) {
            palindrome = "Yes";
        } else {
            palindrome = "No";
        }

        // Output
        System.out.println("\nTotal Characters: " + characters);
        System.out.println("Total Words: " + wordCount);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Reverse: " + reverse);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Palindrome: " + palindrome);

        input.close();
    }
}
    

