package CLG_PRACTICE;

class Point {

    int x;
    int y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int a, int b) {
        x = a;
        y = b;
    }

    // Copy constructor
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    // Display method
    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class P_8 {
    public static void main(String[] args) {

        // Using default constructor
        Point p1 = new Point();

        // Using parameterized constructor
        Point p2 = new Point(10, 20);

        // Using copy constructor
        Point p3 = new Point(p2);

        System.out.println("Default Constructor:");
        p1.display();

        System.out.println("Parameterized Constructor:");
        p2.display();

        System.out.println("Copy Constructor:");
        p3.display();
    }
}
