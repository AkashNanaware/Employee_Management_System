package com.example.employeemanagement;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class employee_imple implements employee_service {
    employee_repo repo;

    public employee_imple(employee_repo repo) {
        this.repo = repo;
    }

    @Override
    public String createemployee(employee_details employee) {
        repo.save(employee);
        return "Created Successfully";
    }

    @Override
    public String updateemployee(employee_details employee) {
        repo.save(employee);
        return "Updated Successfully";
        
    }

    @Override
    public String deleteemployee(String employee_id) {
       repo.deleteById(employee_id);
       return "Deleted Successfully";
    }

    @Override
    public String getemployee(String employee_id) {
        employee_details ed=repo.findById(employee_id).orElse(null);
        if(ed!=null){
            return "Employee_ID "+ed.getEmployee_id()+" Employee_Name "+ed.getEmployee_name()+" Employee_Address "+ed.getEmployee_address()+" Employee_Contact "+ed.getEmployee_contact()+" Employee_Salary "+ed.getEmployee_salary();
        }
       else{
        return "Employee ID Not Found";
       }
    }

    @Override
    public List<employee_details> getallemployee() {
        return repo.findAll();
        
    }
    
}

