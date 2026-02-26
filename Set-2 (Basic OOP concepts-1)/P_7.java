package CLG_PRACTICE;

import java.util.Scanner;

class Employee {

    private String employeeName;
    private double employeeSalary;

    // No-argument constructor
    Employee() {
    }

    // Parameterized constructor
    Employee(String name, double salary) {
        this.employeeName = name;
        this.employeeSalary = salary;
    }

    // Getter methods
    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    // Method to display data
    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}

public class P_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        // Object creation using constructor
        Employee emp = new Employee(name, salary);

        emp.displayEmployeeData();

        sc.close();
    }
}