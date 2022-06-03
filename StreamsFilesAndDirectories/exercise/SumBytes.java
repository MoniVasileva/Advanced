package StreamsFilesAndDirectories.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt"))) {
            String line = bufferedReader.readLine();
            long sum = 0;
            while (line != null) {
                char[] characters = line.toCharArray();
                for (char singleChar : characters) {
                    sum += singleChar;
                }
                line = bufferedReader.readLine();
            }
            System.out.println(sum);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
