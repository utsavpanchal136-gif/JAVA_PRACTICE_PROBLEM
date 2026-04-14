// File Name: P_17.java

interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {
        return mark >= 35;
    }

    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else if (average >= 45)
            return "Second Division";
        else
            return "Third Division";
    }
}

public class P_17 {
    public static void main(String[] args) {
        Result r = new Result();

        int mark = 50;
        double avg = 67.5;

        System.out.println("Mark = " + mark);
        System.out.println("Passed: " + r.isPassed(mark));

        System.out.println("Average = " + avg);
        System.out.println("Division = " + r.getDivision(avg));
    }
}
