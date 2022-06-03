package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class writeFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("output.txt");
            int read = inputStream.read();
            // read != ',' && read != '.'&& read != '!' && read != '?';
            Set<Character> punctuation = Set.of(',', '.', '!', '?');
            while (read != -1) {

                if (!punctuation.contains((char) read)) {
                    outputStream.write(read);
                }
                read = inputStream.read();
            }

        } catch (IOException ignore) {
        }
    }
}
