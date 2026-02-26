package CLG_PRACTICE;

import java.util.Scanner;

public class P_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] values = new double[6];
        char[] names = {'a', 'b', 'c', 'd', 'e', 'f'};

        System.out.println("For equations:");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");

        // Taking input using loop
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter value of " + names[i] + ": ");
            values[i] = sc.nextDouble();
        }

        double a = values[0];
        double b = values[1];
        double c = values[2];
        double d = values[3];
        double e = values[4];
        double f = values[5];

        double D = (a * d) - (b * c);

        if (D == 0) {
            System.out.println("No unique solution because D = 0");
        }
        else {

            double Dx = (e * d) - (b * f);
            double Dy = (a * f) - (e * c);

            double x = Dx / D;
            double y = Dy / D;

            // Format to 2 decimal places
            System.out.printf("Value of x = %.2f\n", x);
            System.out.printf("Value of y = %.2f\n", y);
        }

        sc.close();
    }
}
