package StreamsFilesAndDirectories.exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) {
        try (PrintWriter printWriter= new PrintWriter("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt")){
            Path inputFile = Paths.get("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");
            List<String>  lines = Files.readAllLines(inputFile);
            for (int i = 0; i < lines.size(); i++) {
                printWriter.println((i+1)+". "+lines.get(i));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
