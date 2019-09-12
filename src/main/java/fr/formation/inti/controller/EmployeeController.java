package fr.formation.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.inti.services.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("message", "Bonjour springBoot!");
		return "employee/index";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", service.findAll());
		return "employee/index";
	}
}
