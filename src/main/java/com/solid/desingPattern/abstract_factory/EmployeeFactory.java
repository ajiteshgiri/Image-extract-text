package com.solid.desingPattern.abstract_factory;

public class EmployeeFactory {

    //get Employee

    public  static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
