package SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;


public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 0;

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {
            if (rounds == 50) {
                break;
            }
            Iterator<Integer> firstIterator = firstDeck.iterator();
            int firstCard = firstIterator.next();
            firstIterator.remove();

            Iterator<Integer> secondIterator = secondDeck.iterator();
            int secondCard = secondIterator.next();
            secondIterator.remove();

            if (firstCard > secondCard) {
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else {
                secondDeck.add(firstCard);
                secondDeck.add(secondCard);
            }
            rounds++;
        }
        if (firstDeck.size()>secondDeck.size()){
            System.out.println("First player win!");
        } else if (firstDeck.size()<secondDeck.size()) {
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }

    }
}
