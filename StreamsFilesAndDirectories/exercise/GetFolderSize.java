package StreamsFilesAndDirectories.exercise;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class GetFolderSize {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources");
        Deque<File> files = new ArrayDeque<>();
        files.offer(folder);
        int size = 0;
        while (!files.isEmpty()){
            File currentFIle = files.poll();
            File[] nestedFiles = currentFIle.listFiles();
            for (File nestedFile : nestedFiles) {
                if(nestedFile.isDirectory()){
                    files.offer(nestedFile);
                }else {
                    size+=nestedFile.length();
                }
            }
        }
        System.out.println(size);


    }
}
