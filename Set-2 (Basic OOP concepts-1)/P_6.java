package CLG_PRACTICE;

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

        // Object using default constructor
        Rectangle r1 = new Rectangle();

        // Object using parameterized constructor
        Rectangle r2 = new Rectangle(5, 3);

        System.out.println("Rectangle 1:");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
    }
}
