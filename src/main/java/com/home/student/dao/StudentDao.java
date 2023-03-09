package com.home.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.student.entities.StudentEntity;

public interface StudentDao extends JpaRepository<StudentEntity, Long> {

}
