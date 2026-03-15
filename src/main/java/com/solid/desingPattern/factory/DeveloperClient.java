package com.solid.desingPattern.factory;

public class DeveloperClient {

    public static void main(String[] args) {
        Employee employee = EmployeeFactroy.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee);
        System.out.print(employee.salary());

        Employee emp = EmployeeFactroy.getEmployee("WEB DEVELOPER");
        System.out.println(emp);
        System.out.print(emp.salary());
    }
}
