package com.example.designpatterns.structuralPatterns.adapterPattern;

/*
* Used for interface translation, i.e., when client requires a different object from
* what a functionality provider contains
* */
public class AdapterPatternImpl {
    public static void main(String[] args) {

        System.out.println("************* Using class adapter **************");

        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
        populateEmployee(employeeClassAdapter);
        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
        String card = businessCardDesigner.designCard(employeeClassAdapter);
        System.out.println(card);

        System.out.println("************* Using object adapter **************");

        Employee employee = new Employee();
        populateEmployee(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = businessCardDesigner.designCard(objectAdapter);
        System.out.println(card);
    }

    public static void populateEmployee(Employee employee) {
        employee.setFullName("Divya K");
        employee.setJobTitle("App Dev");
        employee.setOfficeLocation("Bengaluru");
    }
}
