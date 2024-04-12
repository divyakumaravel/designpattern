package com.example.designpatterns.builderMethod;

import com.example.designpatterns.builderMethod.employee.Employee;
import com.example.designpatterns.builderMethod.employee.EmployeeDTO;
import com.example.designpatterns.builderMethod.employee.EmployeeDTOBuilder;
import com.example.designpatterns.builderMethod.employee.EmployeeWebDTOBuilder;

public class BuilderPatternImpl {

    public static void main(String[] args) {
        Employee employee = getEmployee();
        EmployeeDTOBuilder employeeDTOBuilder = new EmployeeWebDTOBuilder();

        EmployeeDTO employeeDTO = directBuild(employee, employeeDTOBuilder);
        System.out.println(employeeDTO);
    }

    public static EmployeeDTO directBuild(Employee employee, EmployeeDTOBuilder employeeDTOBuilder) {
        return employeeDTOBuilder.withFirstName(employee.getFirstName())
                .withLastName(employee.getLastName()).withAge(employee.getAge())
                .build();
    }

    public static Employee getEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Divya");
        employee.setLastName("K");
        employee.setAge(25);
        return employee;
    }
}
