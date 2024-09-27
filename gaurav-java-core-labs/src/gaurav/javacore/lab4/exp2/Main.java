package gaurav.javacore.lab4.exp2;

import gaurav.javacore.lab4.exp2.services.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        EmployeeServiceImpl service = new EmployeeServiceImpl();
        service.getEmployeeDetails();
    }
}