package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Predicate<String> startsWithUppercase = w-> Character.isUpperCase(w.charAt(0));
        List<String> text = Arrays.stream(scanner.nextLine().split(" ")).filter(startsWithUppercase).collect(Collectors.toList());

        System.out.println(text.size());

        Consumer<String> primter = System.out::println;
        text.forEach(primter);
    }
}
