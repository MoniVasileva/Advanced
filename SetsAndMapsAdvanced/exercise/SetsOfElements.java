package SetsAndMapsAdvanced.exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        int [] setSizes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int size1 = setSizes[0];
        int size2 = setSizes[1];

        for (int i = 0; i < size1; i++) {
            set1.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < size2; i++) {
            set2.add(Integer.parseInt(scanner.nextLine()));
        }
        for (Integer element : set1) {
            if(set2.contains(element)){
                System.out.print(element + " ");
            }
        }
    }
}
