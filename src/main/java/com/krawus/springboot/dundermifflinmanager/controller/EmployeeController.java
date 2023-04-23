package com.krawus.springboot.dundermifflinmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krawus.springboot.dundermifflinmanager.entity.Employee;
import com.krawus.springboot.dundermifflinmanager.service.EmployeeService;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/list")
	public String listEmployees(Model model) {

		List<Employee> employeesList = employeeService.findAll();
		model.addAttribute("employees", employeesList);

		return "employees/list-employees";
	}

}









