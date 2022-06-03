package SetsAndMapsAdvanced.exercise;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split(" ");
            Collections.addAll(set, input);
        }
        String result = String.join(" ",set);
        System.out.println(result);
    }
}
