package com.example.designpatterns.builderPattern.employee;

public interface EmployeeDTOBuilder {

    EmployeeDTOBuilder withFirstName(String firstName);
    EmployeeDTOBuilder withLastName(String lastName);
    EmployeeDTOBuilder withAge(int age);
    EmployeeDTO build();
}
