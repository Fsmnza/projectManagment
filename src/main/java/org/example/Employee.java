package org.example;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String contactInformation;
    private List<String> employmentHistory;
    public Employee(){
    }

    public Employee(int id, String name, String contactInformation, List<String> employmentHistory) {
        this.id = id;
        this.name = name;
        this.contactInformation = contactInformation;
        this.employmentHistory = employmentHistory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public List<String> getEmploymentHistory() {
        return employmentHistory;
    }

    public void setEmploymentHistory(List<String> employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactInformation='" + contactInformation + '\'' +
                ", employmentHistory=" + employmentHistory +
                '}';
    }

    public void updateContactInformation(String newContactInformation) {
    }
}
