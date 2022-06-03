package StreamsFilesAndDirectories.exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MergeFiles {
    public static void main(String[] args) {
        Path input1= Paths.get("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path input2= Paths.get("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");
        Path output = Paths.get("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        try {
            List<String> file1 = Files.readAllLines(input1);
            List<String> file2 = Files.readAllLines(input2);
            Files.write(output,file1, StandardOpenOption.APPEND);
            Files.write(output,file2, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
