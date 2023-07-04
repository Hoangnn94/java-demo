package com.hoangnn1.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hoangnn1.demo.exception.ApplicationException;
import com.hoangnn1.demo.form.CreateStudentForm;
import com.hoangnn1.demo.service.StudentService;

@Controller
public class CreateStudentController {
	@Autowired
	private StudentService studentService;
//	http://localhost:8080/creatStudent
	
	@GetMapping("createStudent")
	public String showCreateStudentPage() {
		return "createStudentPage";
	}
	@PostMapping("createStudent")
	public String createStudent(@ModelAttribute CreateStudentForm form, Model model){
		try {
			studentService.save(form);
			return "homePage";
		} catch (ApplicationException e) {
			model.addAttribute("message", e.getMessage());
			return "createStudentPage";
		}
	}
}
