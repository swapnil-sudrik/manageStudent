package com.home.student.services;

import java.io.IOException;
import java.util.List;

import com.home.student.entities.StudentEntity;

public interface StudentService {
	
	public StudentEntity addStudent(StudentEntity student) throws IOException;
	public StudentEntity getOneStudent(long id) throws IOException;
	public List<StudentEntity> getAllStudent() throws IOException;
	public StudentEntity updateStudent(StudentEntity student) throws IOException;
	public void deleteStudent(long id) throws IOException;

}
