package FunctionalProgramming.exercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> people = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            String[] data = input.split(" ");
            String command = data[0];
            Predicate<String> predicate = getPredicate(data);
            switch (command) {
                case "Double":
                    List<String> peopleToAdd = new ArrayList<>();
                    people.stream().filter(predicate).forEach(person -> peopleToAdd.add(person));
                    people.addAll(peopleToAdd);
                    break;
                case "Remove":
                    people.removeIf(predicate);
                    break;


            }
            input = scanner.nextLine();
        }
        if (people.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(people);
            String result = String.join(", ", people) + " are going to the party!";
            System.out.println(result);
        }
    }

    public static Predicate<String> getPredicate(String[] data) {
        Predicate<String> predicate = null;
        String filterName = data[1];
        String filterCriteria = data[2];

        switch (filterName) {
            case "StartsWith":
                predicate = name -> name.startsWith(filterCriteria);
                break;
            case "EndsWith":
                predicate = name -> name.endsWith(filterCriteria);
                break;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(filterCriteria);
                break;
        }
        return predicate;
    }
}
