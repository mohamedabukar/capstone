package org.mohamedabukar.restaurantapp.controller;

import org.mohamedabukar.restaurantapp.entity.Employee;
import org.mohamedabukar.restaurantapp.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ManagerController {

    @Autowired
    private ManagerService eService;

    @GetMapping("/showEmployees")
    public String showEmployees(Model model){
        model.addAttribute("employees", eService.getAllEmployees());
        return "list-employees";
    }

    @GetMapping("/managerPage")
    public String managerHomePage(){
        return "manager";
    }


    @GetMapping({"/addEmployeeForm"})
    public String addEmployeeForm(Model model){
        Employee newEmployee = new Employee();
        model.addAttribute("employee", newEmployee);
        return "add-employee-form";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(employee.getPassword());
        employee.setPassword(encodedPassword);
        eService.saveEmployees(employee);
        return "redirect:/showEmployees";
    }

    @GetMapping("/showUpdateForm")
    public String showUpdateForm(@RequestParam Long employeeId, Model model){
        Employee employee = eService.getEmployeeById(employeeId);
        model.addAttribute("employee", employee);
        return "add-employee-form";
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam Long employeeId){
        eService.deleteById(employeeId);
        return "redirect:/showEmployees";
    }

    @GetMapping("/login")
    public String Login(){
        return "login";
    }
}
