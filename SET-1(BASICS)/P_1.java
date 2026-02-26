package CLG_PRACTICE;

import java.util.Scanner;

public class P_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distance, newDistance;
        String unit;

        System.out.print("Enter the distance: ");
        distance = scanner.nextDouble();

        System.out.println("If you enter M, value will be converted to Feet.");
        System.out.println("If you enter F, value will be converted to Meters.");

        System.out.print("Convert to Meters or Feet? (M/F): ");
        unit = scanner.next().toUpperCase();

        if (unit.equals("M")) {

            // Convert Feet to Meters
            newDistance = distance / 3.28084;
            System.out.printf("%.2f Meters", newDistance);

        }
        else if (unit.equals("F")) {

            // Convert Meters to Feet
            newDistance = distance * 3.28084;
            System.out.printf("%.2f Feet", newDistance);

        }
        else {

            System.out.println("Invalid unit entered.");
        }

        scanner.close();
    }

}

