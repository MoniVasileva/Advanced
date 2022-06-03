package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String programDir = System.getProperty("user.dir");
        String path = "C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\input.txt";
        List<String> strings = Files.readAllLines(Paths.get(path));
        for (int i = 2; i <strings.size() ; i+=3) {
            System.out.println(strings.get(i));
        }

    }
}
