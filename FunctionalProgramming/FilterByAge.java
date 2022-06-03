package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterByAge {
    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] data = scanner.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Person p = new Person(name, age);
            people.add(p);
        }
        String ageCondition = scanner.nextLine();
        int ageFilter = Integer.parseInt(scanner.nextLine());
        String outputFormat = scanner.nextLine();
        filterByAge(people, getPredicate(ageCondition,ageFilter));
        Consumer<Person> printer = getPrinter(outputFormat);
        people.forEach(printer);

    }

    private static Consumer<Person> getPrinter(String outputFormat) {
        switch (outputFormat){
            case "name":
                return p -> System.out.println(p.name);
            case "age":
                return  p -> System.out.println(p.age);
            case "name age":
                return  p-> System.out.printf("%s - %s\n",p.name,p.age);
            default:
                throw new IllegalArgumentException("Unknown format "+outputFormat);
        }
    }

    private static Predicate<Person> getPredicate(String ageCondition, int ageFilter) {
        switch (ageCondition){
            case "younger":
                return p->p.age<=ageFilter;
            case "older":
                return p->p.age>=ageFilter;
            default:
                throw new IllegalArgumentException("Invalid parameters for age predicate "+ageCondition+" "+ageFilter);
        }
    }

    public static List<Person> filterByAge(List<Person> people, Predicate<Person>predicate) {
        return people.stream()
                .filter(predicate).collect(Collectors.toList());

    }

}
