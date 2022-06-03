package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(", "))
                .map(Integer::parseInt)
               .collect(Collectors.toList());

        Function<List<Integer>,String> countFormat = list -> "Count = "+list.size();
        String countOutput = countFormat.apply(numbers);
        System.out.println(countOutput);
        Function<List<Integer>,Integer> sumElements = l -> l.stream().mapToInt(e-> e).sum();

        Function<Integer,String> sumFormater = s ->"Sum = "+s;
        int sum = sumElements.apply(numbers);
        String sumOutput = sumFormater.apply(sum);
        System.out.println(sumOutput);

    }
}
