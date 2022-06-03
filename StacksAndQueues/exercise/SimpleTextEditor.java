package StacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> commands = new ArrayDeque<>();
        ArrayDeque<String> removedElements = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String rawCommand = scanner.nextLine();
            String[] commandArguments = rawCommand.split(" ");
            String commandType = commandArguments[0];
            switch (commandType) {
                case "1":
                    commands.push(rawCommand);
                    executeAdd(commandArguments[1], text);
                    break;
                case "2":
                    commands.push(rawCommand);
                    executeDelete(Integer.parseInt(commandArguments[1]), text);
                    StringBuilder sb = new StringBuilder();
                    for (int j = text.length() - Integer.parseInt(commandArguments[1]); j < text.length(); j++) {
                        sb.append(text.charAt(j));
                    }
                    removedElements.push(sb.toString());
                    break;
                case "3":
                    commands.push(rawCommand);
                    int index = Integer.parseInt(commandArguments[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                    String lastCommand = commands.pop();
                    String[] lastCommandArguments = lastCommand.split(" ");
                    String lastCommandType = lastCommandArguments[0];
                    switch (lastCommandType) {
                        case "1":
                            int elementsToDelete = lastCommandArguments.length;
                            executeDelete(elementsToDelete, text);
                            break;
                        case "2":
                            String elementsToAddBack = removedElements.pop();
                            executeAdd(elementsToAddBack,text);
                            break;
                    }
                    break;

            }
        }
    }

    private static void executeDelete(int countToDelete, StringBuilder text) {
        for (int i = 0; i < countToDelete; i++) {
            text.deleteCharAt(text.length()-1);
        }
    }

    private static void executeAdd(String commandArgument, StringBuilder text) {
        text.append(commandArgument);
    }
}
