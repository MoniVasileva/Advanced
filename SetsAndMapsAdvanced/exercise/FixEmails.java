package SetsAndMapsAdvanced.exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> map = new LinkedHashMap<>();
        String name = scanner.nextLine();
        while (!name.equals("stop")){
            String email = scanner.nextLine();
            if(!email.contains(".us")&&!email.contains(".uk")&&!email.contains(".com")){
                map.put(name,email);
            }

            name= scanner.nextLine();
        }
        for (var emails : map.entrySet()) {
            System.out.printf("%s -> %s\n",emails.getKey(),emails.getValue());
        }
    }
}
