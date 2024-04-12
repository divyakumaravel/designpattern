package com.example.designpatterns.builderMethod.employee;

public class EmployeeWebDTO implements EmployeeDTO {

    private final String firstName;
    private final String lastName;
    private final int age;

    public EmployeeWebDTO(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeWebDTO {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }
}
