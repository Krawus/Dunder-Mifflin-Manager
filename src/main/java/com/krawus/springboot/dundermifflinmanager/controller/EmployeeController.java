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

		List<Employee> employeesList = employeeService.findAllByOrderByLastNameAsc();
		model.addAttribute("employees", employeesList);

		return "employees/list-employees";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model){
		Employee employee = new Employee();

		model.addAttribute("employee", employee);

		return "employees/employee-form";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employeeToSave){
		employeeService.save(employeeToSave);

		return "redirect:/employees/list";

	}
}









