package com.hoangnn1.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hoangnn1.demo.dao.StudentDao;
import com.hoangnn1.demo.entity.StudentEntity;

@Repository
public class ListStudentDao implements StudentDao {

	private static Long ID = 1L;
	private List<StudentEntity> students = new ArrayList<>();

	@Override
	public void save(StudentEntity entity) {
		entity.setId(ID);
		ID++;
		students.add(entity);
	}
}
