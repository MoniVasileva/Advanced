package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\input.txt";
        try(FileInputStream fileStream = new FileInputStream(path)){
            int oneByte = fileStream.read();
            while (oneByte>=0){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte=fileStream.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
