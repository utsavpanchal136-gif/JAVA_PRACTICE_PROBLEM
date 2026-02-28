package CLG_PRACTICE;

import java.util.Scanner;

class College {

    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Non-static Inner Class
    class Admission {

        private String studentName;
        private String course;

        public void acceptDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        public void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course Enrolled: " + course);
        }
    }
}

public class P_11 {

    public static void main(String[] args) {

        College college = new College("SSASIT, Surat");

        College.Admission admission = college.new Admission();

        admission.acceptDetails();
        admission.displayDetails();
    }
}