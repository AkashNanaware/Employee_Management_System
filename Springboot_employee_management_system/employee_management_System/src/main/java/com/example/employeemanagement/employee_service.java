package com.example.employeemanagement;
import java.util.List;
public interface employee_service {
    public String createemployee(employee_details employee);
    public String updateemployee(employee_details employee);
    public String deleteemployee(String employee_id);
    public String getemployee(String employee_id);
    public List<employee_details>getallemployee();
  
}