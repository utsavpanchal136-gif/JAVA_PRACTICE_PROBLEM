package CLG_PRACTICE;

import java.util.Scanner;

class Employee {

    private String employeeName;
    private double employeeSalary;

    // Method to take input
    public void readEmployeeData() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    // Method to display data
    public void displayEmployeeData() {

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}

public class P_7 {

    public static void main(String[] args) {

        Employee emp = new Employee();   // Object creation

        emp.readEmployeeData();          // Method call
        emp.displayEmployeeData();       // Method call
    }
}
