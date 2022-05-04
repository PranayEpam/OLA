    package com.ola.test;

import com.ola.test.model.Employee;
import com.ola.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class OlaTestApplication {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {

        SpringApplication.run(OlaTestApplication.class, args);
        List<Employee> employeeList = getEmployeeList();
        List<Employee> compartorList = employeeList.stream().sorted(Comparator.comparingInt(Employee::getId).thenComparing(Employee::getName)).collect(Collectors.toList());
        List<Employee> compaaList = employeeList.stream().sorted().collect(Collectors.toList());
    }


    private static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee(1, "abc", "add1");
        Employee e2 = new Employee(2, "efg", "add2");
        Employee e3 = new Employee(3, "hij", "add3");
        Employee e4 = new Employee(4, "xyz", "add4");
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        return employeeList;
    }
}


