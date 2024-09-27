package gaurav.javacore.lab4.exp2.services;

import gaurav.javacore.lab4.exp2.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private Scanner scanner = new Scanner(System.in);

    public void getEmployeeDetails() {
        System.out.println("Enter Employee ID:");
        int id = scanner.nextInt();
        System.out.println("Enter Employee Name:");
        String name = scanner.next();
        System.out.println("Enter Employee Salary:");
        double salary = scanner.nextDouble();
        System.out.println("Enter Employee Designation:");
        String designation = scanner.next();

        Employee emp = new Employee(id, name, salary, designation);
        findInsuranceScheme(emp);
        displayEmployeeDetails(emp);
    }

    public void findInsuranceScheme(Employee emp) {
        if (emp.salary < 30000) {
            emp.setInsuranceScheme("Basic Scheme");
        } else {
            emp.setInsuranceScheme("Premium Scheme");
        }
    }

    public void displayEmployeeDetails(Employee emp) {
        System.out.println(emp);
    }
}

