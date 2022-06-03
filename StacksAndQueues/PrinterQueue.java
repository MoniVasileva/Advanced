package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!fileName.equals("print")) {
            if (fileName.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                }else{
                    String firtInQueue = queue.poll();
                    System.out.printf("Canceled %s\n",firtInQueue);
                }
            } else {
                queue.offer(fileName);
            }

            fileName = scanner.nextLine();
        }
       while (!queue.isEmpty()){
           System.out.println(queue.poll());
        }
    }
}
