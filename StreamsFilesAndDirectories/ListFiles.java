package StreamsFilesAndDirectories;

import java.io.File;
import java.util.Arrays;

public class ListFiles {
    public static void main(String[] args) {
        String programDir = System.getProperty("user.dir");

        String path = programDir+"C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\input.txt";
        File root = new File("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        Arrays.stream(root.listFiles()).filter(File::isFile).forEach(f -> System.out.println(f.getName()+": "+"["+f.length()+"]"));
    }
}
