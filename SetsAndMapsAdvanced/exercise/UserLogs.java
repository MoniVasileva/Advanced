package SetsAndMapsAdvanced.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String,Integer>> users = new TreeMap<>();
        while (!input.equals("end")){
            String [] parts = input.split(" ");
            String ipParts = parts[0];
            String usernameParts = parts[2];
            String username = usernameParts.substring(5);
            String ip = ipParts.substring(3);

            if(!users.containsKey(username)){
                users.put(username,new LinkedHashMap<>());
            }
            if(!users.get(username).containsKey(ip)){
                users.get(username).put(ip,1);
            }else {
                int ipAttacks = users.get(username).get(ip)+1;
                users.get(username).put(ip,ipAttacks);
            }


            input= scanner.nextLine();
        }
        for (var user : users.entrySet()) {
            System.out.printf("%s:\n",user.getKey());
            LinkedHashMap<String,Integer> attacks = user.getValue();
            StringBuilder sb = new StringBuilder();
            for (var ipAttack : attacks.entrySet()) {
                String fromatedAttack = String.format("%s => %d, ",ipAttack.getKey(),ipAttack.getValue());
                sb.append(fromatedAttack);
            }
            String finalOutput = sb.substring(0,sb.length()-2);
            finalOutput = finalOutput + ".";
            System.out.println(finalOutput);

        }
    }
}
