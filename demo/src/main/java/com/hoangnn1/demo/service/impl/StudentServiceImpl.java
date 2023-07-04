package com.hoangnn1.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoangnn1.demo.dao.StudentDao;
import com.hoangnn1.demo.entity.StudentEntity;
import com.hoangnn1.demo.exception.ApplicationException;
import com.hoangnn1.demo.form.CreateStudentForm;
import com.hoangnn1.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;
	
	@Override
	
	public void save(CreateStudentForm form) {
		validateCreateStudentForm(form);
		StudentEntity newStudent = new StudentEntity();
		newStudent.setName(form.getName());
		newStudent.setAge(form.getAge());
		newStudent.setDateOfBirth(form.getDateOfBirth());
		newStudent.setScore(form.getScore());
		studentDao.save(newStudent);
		
	} 
	
	private void validateCreateStudentForm(CreateStudentForm form) {
		String age = form.getAge();
		
		try {
			Integer.valueOf(age);
		} catch (NumberFormatException e) {
			throw new ApplicationException("Tuoi sinh vien phai la 1 so");
		}
	}
}
