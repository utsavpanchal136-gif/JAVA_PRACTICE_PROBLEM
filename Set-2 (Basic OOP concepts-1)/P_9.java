package CLG_PRACTICE;

class RectanglE {

    double width;
    double height;

    // Constructor
    RectanglE(double w, double h) {
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

public class P_9 {

    public static void main(String[] args) {

        // Create two Rectangle objects
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        // Display details of first rectangle
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println();

        // Display details of second rectangle
        System.out.println("Rectangle 2:");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        System.out.println();

        // Compare areas
        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has larger area.");
        }
        else if (r1.getArea() < r2.getArea()) {
            System.out.println("Rectangle 2 has larger area.");
        }
        else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}
