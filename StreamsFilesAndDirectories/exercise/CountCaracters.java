package StreamsFilesAndDirectories.exercise;

import java.io.*;

public class CountCaracters {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        try (FileReader fileReader = new FileReader("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
            PrintWriter pw = new PrintWriter(new FileWriter("output.txt"))){
            int symbols = fileReader.read();
            while (symbols >= 0) {
                char symbol = (char) symbols;
                if (isVowel(symbol)) {
                    vowels++;
                } else if (isPunctuation(symbol)) {
                    punctuation++;
                } else if (!Character.isWhitespace(symbol)) {
                    consonants++;
                }
                symbols = fileReader.read();
            }
            pw.printf("Vowels: %d\n", vowels);
            pw.printf("Consonants: %d\n", consonants);
            pw.printf("Punctuation: %d", punctuation);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static boolean isVowel(char character) {
        return character == 'a' || character == 'o' || character == 'u' || character == 'e' || character == 'i';
    }

    public static boolean isPunctuation(char character) {
        return character == '!' || character == ',' || character == '.' || character == '?';
    }
}
