package com.example.designpatterns.builderPattern;

import com.example.designpatterns.builderPattern.employee.Employee;
import com.example.designpatterns.builderPattern.employee.EmployeeDTO;
import com.example.designpatterns.builderPattern.employee.EmployeeDTOBuilder;
import com.example.designpatterns.builderPattern.employee.EmployeeWebDTOBuilder;
import com.example.designpatterns.builderPattern.home.Home;
import com.example.designpatterns.builderPattern.home.HomeDTO;
import com.example.designpatterns.builderPattern.home.HomeDTOBuilder;
import com.example.designpatterns.builderPattern.home.MyHomeDTOBuilder;

/*
 * Builder pattern - A way to construct complex objects
 * */
public class BuilderPatternImpl {

    public static void main(String[] args) {
        try {
            Employee employee = getEmployee();
            EmployeeDTOBuilder employeeDTOBuilder = new EmployeeWebDTOBuilder();

            EmployeeDTO employeeDTO = directBuild(employee, employeeDTOBuilder);
            System.out.println(employeeDTO);

            Home home = getHome();
            HomeDTO homeDTO = directBuild(home, new MyHomeDTOBuilder());
            System.out.println(homeDTO);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static EmployeeDTO directBuild(Employee employee, EmployeeDTOBuilder employeeDTOBuilder) {
        return employeeDTOBuilder.withFirstName(employee.getFirstName())
                .withLastName(employee.getLastName()).withAge(employee.getAge())
                .build();
    }

    public static HomeDTO directBuild(Home home, HomeDTOBuilder homeDTOBuilder) {
        return homeDTOBuilder.buildDoor(home.getDoor())
                .buildWalls(home.getWalls())
                .buildWindow(home.getWindow())
                .buildPool(home.getPool())
                .buildGarage(home.getGarage())
                .build();
    }

    public static Employee getEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Divya");
        employee.setLastName("K");
        employee.setAge(25);
        return employee;
    }

    public static Home getHome() {
        Home home = new Home();
        home.setDoor("door");
        home.setWalls("Walls");
        home.setWindow("Windows");
        home.setGarage("Garage");
        home.setPool("Pool");
        return home;
    }
}
