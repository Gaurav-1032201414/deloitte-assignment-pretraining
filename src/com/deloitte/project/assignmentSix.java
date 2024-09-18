package com.deloitte.project;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class assignmentSix {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 75000));
        employees.add(new Employee("Bob", 55, 90000));
        employees.add(new Employee("Charlie", 45, 120000));
        employees.add(new Employee("Diana", 60, 85000));
        employees.add(new Employee("Evan", 22, 50000));

        Predicate<Employee> isSenior = Employee::isSenior;
        Predicate<Employee> hasHighSalary = Employee::hasHighSalary;

        Function<Employee, String> employeeToString = Employee::toString;
        Consumer<String> printer = System.out::println;

        System.out.println("Senior Employees:");
        processEmployees(employees, isSenior, employeeToString, printer);

        System.out.println("\nEmployees with High Salary:");
        processEmployees(employees, hasHighSalary, employeeToString, printer);
    }

    private static void processEmployees(List<Employee> employees,
                                         Predicate<Employee> filter,
                                         Function<Employee, String> mapper,
                                         Consumer<String> action) {
        for (Employee emp : employees) {
            if (filter.test(emp)) {
                String result = mapper.apply(emp);
                action.accept(result);
            }
        }
    }
}


class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static boolean isSenior(Employee emp) {
        return emp.getAge() > 50;
    }

    public static boolean hasHighSalary(Employee emp) {
        return emp.getSalary() > 80000;
    }
}
