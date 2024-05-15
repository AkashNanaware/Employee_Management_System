package com.example.employeemanagement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface employee_repo extends JpaRepository<employee_details, String> {
    
}
