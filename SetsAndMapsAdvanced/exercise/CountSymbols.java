package SetsAndMapsAdvanced.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character,Integer> map  = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if(!map.containsKey(symbol)){
                map.put(symbol,1);
            }else {
                int count = map.get(symbol);
                map.put(symbol,++count);

            }
        }
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.printf("%s: %d time/s\n",pair.getKey(),pair.getValue());
        }
    }
}
