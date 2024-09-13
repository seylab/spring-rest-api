package com.example.config;

import com.example.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Mehmet", "Olgun"));
        employeeList.add(new Employee("2", "John", "Doe"));
        employeeList.add(new Employee("3", "Jane", "Doe"));
        employeeList.add(new Employee("4", "Mary", "Doe"));
        employeeList.add(new Employee("5", "Max", "Doe"));
        employeeList.add(new Employee("6", "Jack", "Doe"));
        employeeList.add(new Employee("7", "Jannie", "Doe"));
        employeeList.add(new Employee("8", "Jamie", "Doe"));
        employeeList.add(new Employee("9", "James", "Doe"));
        employeeList.add(new Employee("10", "Rames", "Doe"));



        return employeeList;
    }

}
