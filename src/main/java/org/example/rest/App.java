package org.example.rest;

import org.example.rest.configuration.MyConfig;
import org.example.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


        // Получение всех работников
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        // Получение одного работника по id
        Employee employeeById = communication.getEmployee(1);
        System.out.println(employeeById);

        // Добавление работника
        Employee emp = new Employee("Chris", "Brown", "HR", 500);
        communication.saveEmployee(emp);

        // Обновление работника
        emp.setId(7);
        communication.saveEmployee(emp);

        // Удаление работника
        communication.deleteEmployee(7);
    }
}
