package StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\input.txt";
        String programDir = System.getProperty("user.dir");

        List<String> sortedLInes = Files.readAllLines(Paths.get(path))
                .stream()
                .sorted().toList();

        Path outputFile = Path.of("sorted-lines-out.txt");
        Files.createFile(outputFile);
        Files.write(outputFile,sortedLInes, StandardOpenOption.WRITE);
    }
}
