package com.example.employeemanagement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee_details")
public class employee_controller {
    private final employee_service es;

    public employee_controller(employee_service es) {
        this.es = es;
    }

    @GetMapping("/{employee_id}")
    public String getEmployeeDetails(@PathVariable("employee_id") String employee_id, Model model) {
        model.addAttribute("employee", es.getemployee(employee_id));
        return "employeedetails";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("employee", new employee_details());
        return "createemployee";
    }

    @PostMapping("/create")
    public String createEmployeeDetails(@ModelAttribute("employee") employee_details employee) {
        es.createemployee(employee);
        return "redirect:/employee_details";
    }

    @GetMapping("/update/{employee_id}")
    public String showUpdateForm(@PathVariable("employee_id") String employee_id, Model model) {
        model.addAttribute("employee", es.getemployee(employee_id));
        return "updateemployee";
    }

    @PostMapping("/update")
    public String updateEmployeeDetails(@ModelAttribute("employee") employee_details employee) {
        es.updateemployee(employee);
        return "redirect:/employee_details";
    }

    @GetMapping("/delete/{employee_id}")
    public String deleteEmployeeDetails(@PathVariable("employee_id") String employee_id) {
        es.deleteemployee(employee_id);
        return "redirect:/employee_details";
    }

    @GetMapping
    public String getAllEmployeeDetails(Model model) {
        model.addAttribute("employees", es.getallemployee());
        return "allemployeedetails";
    }
}
