package CLG_PRACTICE;

import java.util.Scanner;

class Rectangle {

    double width = 1;
    double height = 1;

    // No-argument constructor
    Rectangle() {
    }

    // Parameterized constructor
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    // Method to calculate area
    double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class P_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for first rectangle
        System.out.print("Enter width for Rectangle 1: ");
        double w1 = sc.nextDouble();

        System.out.print("Enter height for Rectangle 1: ");
        double h1 = sc.nextDouble();

        Rectangle r1 = new Rectangle(w1, h1);

        System.out.println();

        // Input for second rectangle
        System.out.print("Enter width for Rectangle 2: ");
        double w2 = sc.nextDouble();

        System.out.print("Enter height for Rectangle 2: ");
        double h2 = sc.nextDouble();

        Rectangle r2 = new Rectangle(w2, h2);

        System.out.println("\nRectangle 1:");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        sc.close();
    }
}