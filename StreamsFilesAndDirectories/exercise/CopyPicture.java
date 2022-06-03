package StreamsFilesAndDirectories.exercise;

import java.io.*;

public class CopyPicture {
    public static void main(String[] args) {
         byte [] buffer = new byte[1024];
         try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Мони Василева\\Desktop\\java\\JavaAdvanced\\PNG_transparency_demonstration_1.png");
              FileOutputStream fileOutputStream = new FileOutputStream("copyImage.jpg")){
             while (fileInputStream.read(buffer)!=-1){
                 fileOutputStream.write(buffer);
             }
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
    }
}
