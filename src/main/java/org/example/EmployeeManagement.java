package org.example;

import java.util.List;
import java.util.ArrayList;
public class EmployeeManagement {
    private List<Employee> employees;

    public EmployeeManagement() {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void updateEmployeeContactInformation(int id, String newContactInformation) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            employee.updateContactInformation(newContactInformation);
            System.out.println("Contact information updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
    public void deleteEmployee(int id) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            employees.remove(employee);
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
