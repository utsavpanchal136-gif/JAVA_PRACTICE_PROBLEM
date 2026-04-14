// File Name: P_16.java

interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else
            return "Second Division";
    }
}

public class P_16 {
    public static void main(String[] args) {
        Result r = new Result();

        double avg = 75.5;
        System.out.println("Average = " + avg);
        System.out.println("Division = " + r.getDivision(avg));
    }
}
