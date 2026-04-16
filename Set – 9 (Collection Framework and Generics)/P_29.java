import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P_29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<Integer>();

        System.out.println("Enter 5 student marks:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("\nAll Marks: " + marks);

        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);

        sc.close();
    }
}
