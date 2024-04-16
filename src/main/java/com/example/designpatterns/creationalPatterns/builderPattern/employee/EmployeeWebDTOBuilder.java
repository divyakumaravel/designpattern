package com.example.designpatterns.creationalPatterns.builderPattern.employee;

public class EmployeeWebDTOBuilder implements EmployeeDTOBuilder {

    String firstname;
    String lastname;
    int age;

    @Override
    public EmployeeDTOBuilder withFirstName(String firstName) {
        this.firstname = firstName;
        return this;
    }

    @Override
    public EmployeeDTOBuilder withLastName(String lastName) {
        this.lastname = lastName;
        return this;
    }

    @Override
    public EmployeeDTOBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public EmployeeDTO build() {
        return new EmployeeWebDTO(firstname, lastname, age);
    }
}
