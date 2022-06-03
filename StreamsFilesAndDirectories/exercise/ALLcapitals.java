package StreamsFilesAndDirectories.exercise;

import java.io.*;


public class ALLcapitals {
    public static void main(String[] args) {
        String path ="C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt"))){
            bufferedReader.lines().forEach(line-> printWriter.println(line.toUpperCase()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
