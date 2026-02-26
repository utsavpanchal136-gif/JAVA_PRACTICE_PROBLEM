package CLG_PRACTICE;

import java.util.Scanner;

public class P_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter side a: ");
        a = sc.nextDouble();

        System.out.print("Enter side b: ");
        b = sc.nextDouble();

        System.out.print("Enter side c: ");
        c = sc.nextDouble();

        // Check if sides can form a triangle
        if (a + b > c && a + c > b && b + c > a) {

            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Apply Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.printf("Area of the triangle = %.2f", area);

        } else {
            System.out.println("The given sides cannot form a valid triangle.");
        }

        sc.close();
    }
}
