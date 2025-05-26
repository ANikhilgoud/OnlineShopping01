package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeServiceMgnt;

@Controller
public class EmployeeController {
	@Autowired
	IEmployeeServiceMgnt empservice;
	// for home page

	@GetMapping("/")
	public String HomePage() {
		return "home";
	}

	// for employees list

	@GetMapping("/report")
	public String ShowAllEmployees(Map<String, Object> map) {
		Iterable<Employee> emplist = empservice.ShowAllEmployees();
		map.put("EmpList", emplist);
		return "show_emplist";
	}

	// for register form
	@GetMapping("/register")
	public String EmpRegisterForm(@ModelAttribute("emp") Employee emp) {
		return "Reg_Form";

	}

//	@PostMapping("/register")
//	public String EmpRegistration(@ModelAttribute("emp") Employee emp,Map<String,Object> map) {
//		String msg=empservice.registerEmployee(emp);
//		Iterable<Employee> iemp=empservice.ShowAllEmployees();
//		map.put("resultmsg", msg);
//		map.put("EmpList", iemp);
//		return "show_emplist";
//		this gives doublepost problem

//	}//for registering
	@PostMapping("/register")
	public String EmpRegistration(@ModelAttribute("emp") Employee emp, RedirectAttributes atts) {
		String msg = empservice.registerEmployee(emp);
		atts.addFlashAttribute("resultmsg", msg);

		return "redirect:register";

	}

	// For Deleting
	@GetMapping("/delete")
	public String DeleteEmployeeById(RedirectAttributes attr, @RequestParam int no) {
		String msg = empservice.RemoveEmployeeById(no);
		attr.addFlashAttribute("resultmsg", msg);
		return "redirect:report";

	}
	// we can use any one method for deletion either of the two methods
//	@GetMapping("/delete")
//	public String DeleteEmployeeById(Map<String,Object> map,@RequestParam int no) {
//		String msg=empservice.RemoveEmployeeById(no);
//		map.put("resultmsg" ,msg);
//		return "forward:report";
//		
//	}

	// Form page for updating
	@GetMapping("/edit")
	public String Form_for_EditEmployeeDetails(@ModelAttribute("emp") Employee emp) {
		return "emp_edit";

	}

	@PostMapping("/edit")
	public String EditEmployeeDetails(@ModelAttribute("emp") Employee emp, RedirectAttributes attr) {
		String msg = empservice.updateEmployeeData(emp);
		attr.addFlashAttribute("resultmsg", "msg");
		return "redirect:report";

	}

}
