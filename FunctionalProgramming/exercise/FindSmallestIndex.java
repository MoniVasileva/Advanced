package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSmallestIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        Function<List<Integer>,Integer>minElementIndex = list->{
            int minElement = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < numbers.size(); i++) {
                if(list.get(i)<=minElement){
                    minElement= numbers.get(i);
                    minIndex=i;
                }
            }
            return minIndex;
        } ;
        System.out.println(minElementIndex.apply(numbers));


    }
}
