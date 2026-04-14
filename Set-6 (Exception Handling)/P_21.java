// File Name: P_21.java

class VotingApp {

    void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote.");
        }
    }
}

public class P_21 {
    public static void main(String[] args) {
        VotingApp v = new VotingApp();

        int age = 16;   // Change value for testing

        try {
            v.checkEligibility(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }
    }
}
