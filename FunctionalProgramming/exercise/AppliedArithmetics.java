package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().toList();
        UnaryOperator<List<Integer>> add = numbersList ->numbersList.stream().map(el->el+1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtract = numbersList ->numbersList.stream().map(el->el-1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiply = numbersList ->numbersList.stream().map(el->el*2).collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("end")){
            switch (input){
                case "add":
                   numbers= add.apply(numbers);
                    break;
                case "subtract":
                    numbers= subtract.apply(numbers);
                    break;
                case "multiply":
                    numbers= multiply.apply(numbers);
                    break;
                case "print":
                    numbers.forEach(number-> System.out.printf("%d ",number));
                    break;
            }

            input= scanner.nextLine();
        }
    }
}
