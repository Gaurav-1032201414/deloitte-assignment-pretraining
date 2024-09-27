package gaurav.javacore.lab5.exp3;

import java.util.Scanner;

class EmployeeException extends Exception {
    public EmployeeException(String message) {
        super(message);
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, salary);

        try {
            validateSalary(employee);
            System.out.println("Employee salary is valid: " + employee.getSalary());
        } catch (EmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateSalary(Employee employee) throws EmployeeException {
        if (employee.getSalary() < 3000) {
            throw new EmployeeException("Salary must be at least 3000.");
        }
    }
}

