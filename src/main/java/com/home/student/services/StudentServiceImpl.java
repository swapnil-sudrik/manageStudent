package com.home.student.services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.student.dao.StudentDao;
import com.home.student.entities.StudentEntity;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao database;

	@Override
	public StudentEntity addStudent(StudentEntity student) throws IOException {
		
		database.save(student);
		
		return student;
	}

	@Override
	public StudentEntity getOneStudent(long id) throws IOException {
		
		return database.getById(id);
	}

	@Override
	public List<StudentEntity> getAllStudent() throws IOException {
		
		
		return database.findAll();
	}

	@Override
	public StudentEntity updateStudent(StudentEntity student) throws IOException {
		
		
		return database.save(student);
	}

	@Override
	public void deleteStudent(long id) throws IOException {
		
		database.deleteById(id);
		
	}

}
