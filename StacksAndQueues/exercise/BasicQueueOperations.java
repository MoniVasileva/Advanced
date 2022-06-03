package StacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque <Integer> queue = new ArrayDeque<>();
        int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int countToPush = input[0];
        int countToPop = input[1];
        int elementToSearch = input[2];

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < countToPush; i++) {
            queue.offer(numbers[i]);
        }
        for (int i = 0; i < countToPop; i++) {
            queue.poll();
        }
        if(queue.contains(elementToSearch)){
            System.out.println("true");
        }else if (queue.isEmpty()){
            System.out.println("0");
        }else {
            System.out.println(Collections.min(queue));
        }

    }
}
