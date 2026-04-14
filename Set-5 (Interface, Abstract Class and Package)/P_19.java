package student;

public class Student {
    public int rollNo;
    public String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}


package exam;

import student.Student;

public class Result extends Student {
    int marks1, marks2, marks3;

    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        displayStudent();
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}


package exam;

public class P_19 {
    public static void main(String[] args) {
        Result r = new Result(101, "Utsav", 85, 90, 88);
        r.displayResult();
    }
}
