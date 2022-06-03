package StreamsFilesAndDirectories.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                long sum = 0;
                char[] characters = line.toCharArray();
                for (char singleChar : characters) {
                    sum += singleChar;
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
