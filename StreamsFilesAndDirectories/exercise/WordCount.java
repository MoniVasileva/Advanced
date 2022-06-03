package StreamsFilesAndDirectories.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
     try (Scanner scanner = new Scanner(new FileReader("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt"));
    Scanner textScaner = new Scanner(new FileReader("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt"));
          PrintWriter printWriter = new PrintWriter("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt")){
         LinkedHashMap<String,Integer> wordMap = new LinkedHashMap<>();
         Arrays.stream(scanner.nextLine().split(" ")).forEach(word->wordMap.put(word,0));

         while (textScaner.hasNext()){
             String textInput = textScaner.next();
             if(wordMap.containsKey(textInput)){
                 int occurences = wordMap.get(textInput);
                 occurences++;
                 wordMap.put(textInput,occurences);
             }
         }
         wordMap.entrySet().forEach(entry ->printWriter.printf("%s - %d\n",entry.getKey(),entry.getValue()));


     } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
     }
    }
}
