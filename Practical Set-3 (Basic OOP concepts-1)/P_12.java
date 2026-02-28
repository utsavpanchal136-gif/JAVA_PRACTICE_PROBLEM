package CLG_PRACTICE;

import java.util.Scanner;

class VolumeCalculator {

    // Cube
    public double calculateVolume(double side) {
        return side * side * side;
    }

    // Rectangular Cube
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Sphere
    public double calculateVolume(int radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class P_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();

        System.out.println("Choose Shape:");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Cube");
        System.out.println("3. Sphere");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter side of cube: ");
                double side = sc.nextDouble();
                double cubeVolume = vc.calculateVolume(side);
                System.out.println("Volume of Cube: " + cubeVolume);
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                double rectVolume = vc.calculateVolume(length, width, height);
                System.out.println("Volume of Rectangular Cube: " + rectVolume);
                break;

            case 3:
                System.out.print("Enter radius of sphere: ");
                int radius = sc.nextInt();
                double sphereVolume = vc.calculateVolume(radius);
                System.out.println("Volume of Sphere: " + sphereVolume);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}