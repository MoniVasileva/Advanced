package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(inputStream);

        PrintWriter writer = new PrintWriter(new FileOutputStream("integers-out.txt"));

        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                writer.println(scanner.next());
            }else {
                scanner.next();
            }

        }
        writer.close();
    }
}
