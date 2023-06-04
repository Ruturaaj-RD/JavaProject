package com.ruturaj.employeemanagementsystem.controller;

import com.ruturaj.employeemanagementsystem.model.Employee;
import com.ruturaj.employeemanagementsystem.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    @RequestMapping("/error")
    public String handleError(Model model, HttpServletRequest request) {
        Object errorMsg = request.getAttribute("javax.servlet.error.message");
        model.addAttribute("errorMsg", errorMsg);
        return "error";
    }
    @GetMapping("/login")
    public String login() {
        return "views/login";
    }

    @GetMapping("/employee-list")
    public String showEmployeeList(Model model) {
        // Retrieve employee list from the service
        List<Employee> employeeList = employeeService.getAllEmployees();
        model.addAttribute("employeeList", employeeList);
        return "views/employeeList";
    }
  

    @PostMapping("/logout")
    public String logout() {
        // Perform logout logic here (e.g., invalidate session, clear authentication, etc.)
        // You can customize the logout process based on your authentication mechanism

        // Redirect the user back to the login page
        return "redirect:/login";
    }

    // Add handlers for adding, editing, and removing employees
    // Implement appropriate methods in the EmployeeService to perform CRUD operations
    // Map the handlers to appropriate endpoints
}
