// File Name: P_20.java

public class P_20 {
    public static void main(String[] args) {
        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result = " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter numerator and denominator.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer numbers.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Denominator cannot be zero.");

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }
    }
}
