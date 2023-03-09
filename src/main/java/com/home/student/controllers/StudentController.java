package com.home.student.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.student.entities.StudentEntity;
import com.home.student.services.StudentService;
import com.home.student.services.StudentServiceImpl;

@CrossOrigin
@RestController
public class StudentController {
	
	@Autowired 
	private StudentServiceImpl service;
	
	@PostMapping("/add")
	public StudentEntity addStudent(@RequestBody StudentEntity student) throws IOException{
		return this.service.addStudent(student);
	}
	
	@GetMapping("/getOne/{id}")
	public StudentEntity getOneStudent(@PathVariable long id) throws IOException {
		return this.service.getOneStudent(id);
	}
	
	@GetMapping("/all")
	public List<StudentEntity> getAllStudent() throws IOException{
		return this.service.getAllStudent();
	}
	
	@PutMapping("/update")
	public StudentEntity updateStudent(@RequestBody StudentEntity student) throws IOException{
		return this.service.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable long id) throws IOException{
		 this.service.deleteStudent(id);
	}

}
