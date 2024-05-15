package com.example.employeemanagement;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Employee_Info")
public class employee_details {
    @Id
    private String employee_id;
    private String employee_name;
    private String employee_contact;
    private String employee_address;
    private String employee_salary;
    public employee_details() {
    }
    public employee_details(String employee_id, String employee_name, String employee_contact, String employee_address,
            String employee_salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_contact = employee_contact;
        this.employee_address = employee_address;
        this.employee_salary = employee_salary;
    }
    public String getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public String getEmployee_contact() {
        return employee_contact;
    }
    public void setEmployee_contact(String employee_contact) {
        this.employee_contact = employee_contact;
    }
    public String getEmployee_address() {
        return employee_address;
    }
    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }
    public String getEmployee_salary() {
        return employee_salary;
    }
    public void setEmployee_salary(String employee_salary) {
        this.employee_salary = employee_salary;
    }
}

