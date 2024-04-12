package com.example.designpatterns.builderMethod;

public interface EmployeeDTOBuilder {

    EmployeeDTOBuilder withFirstName(String firstName);
    EmployeeDTOBuilder withLastName(String lastName);
    EmployeeDTOBuilder withAge(int age);
    EmployeeDTO build();
}
