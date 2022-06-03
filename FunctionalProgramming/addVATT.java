package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class addVATT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  Function<Double,Double> addVat = p->p*1.20;
        Consumer<Double>printer =d-> System.out.printf("%.2f\n",d);
        UnaryOperator<Double> vat = p->p*1.20;
        System.out.println("Prices with VAT:");

        Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble).map(vat).forEach(printer);
    }
}
