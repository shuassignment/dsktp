package com.cg.app.employee.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cg.app.employee.poop.Employee;
import com.cg.app.employee.service.EmployeeService;
import com.cg.app.employee.validator.EmployeeValidator;

@Controller
@RequestMapping("/employee")
@SessionAttributes("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@Autowired
	private EmployeeValidator validator;
	
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String askDetails(Map map) {
		map.put("employee", new Employee());
		System.out.println();
		return "input";

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String showDetails(@ModelAttribute("employee") Employee employee, BindingResult result) {

		validator.validate(employee, result);
		if (result.hasErrors()) {
			return "input";
		}
		
		service.insertEmployee(employee);
		return "redirect:afterSave";
	}

	@RequestMapping(value = "/afterSave", method = RequestMethod.GET)
	public String showDetails() {
		return "display";
	}

	/*
	 * @RequestMapping("/accept") public String askDetails() { return "input"; }
	 * 
	 * @RequestMapping("/save") public String showDetails(@RequestParam("empId") int
	 * empId,
	 * 
	 * @RequestParam("empName") String empName,
	 * 
	 * @RequestParam("salary") double salary, Model model) {
	 * 
	 * Employee employee =new Employee(empId, empName, salary);
	 * model.addAttribute("employee",employee);
	 * 
	 * return "display"; }
	 * 
	 * 
	 * @RequestMapping("/save") public String
	 * showDetails( @ModelAttribute("employee") Employee employee ) {
	 * 
	 * return "display"; }
	 */
}
