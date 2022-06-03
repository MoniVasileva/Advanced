package StacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> openningBrackets = new ArrayDeque<>();
        boolean isBallanced = true;
        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);
            if(currentBracket=='{' || currentBracket == '(' ||currentBracket == '['){
                openningBrackets.push(currentBracket);
            }else {
                if (openningBrackets.isEmpty()){
                    isBallanced=false;
                    break;
                }
                char lastOpeningBracket = openningBrackets.pop();
                if(currentBracket== '}'&& lastOpeningBracket !='{'){
                    isBallanced = false;
                    break;
                } else if (currentBracket== ')'&& lastOpeningBracket !='(') {
                    isBallanced=false;
                    break;
                } else if (currentBracket== ']'&& lastOpeningBracket !='[') {
                    isBallanced=false;
                    break;
                }
            }
        }
        if (isBallanced){
            System.out.println("YES");
        }   else {
            System.out.println("NO");
        }

    }
}
