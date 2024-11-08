package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cars = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while(!input.equals("END")){

            String[] tokens = input.split(", ");

            String direction = tokens[0];
            String registration = tokens[1];

            if(direction.equals("IN")){
                cars.add(registration);
            }else {
                cars.remove(registration);
            }

            input= scanner.nextLine();
        }
        if (cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            System.out.println(String.join(System.lineSeparator(),cars));
        }
    }
}
