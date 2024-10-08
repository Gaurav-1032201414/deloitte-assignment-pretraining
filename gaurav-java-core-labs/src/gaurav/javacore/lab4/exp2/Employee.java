package gaurav.javacore.lab4.exp2;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public void setInsuranceScheme(String insuranceScheme) {
        this.insuranceScheme = insuranceScheme;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Designation: " + designation + ", Insurance Scheme: " + insuranceScheme;
    }
}

