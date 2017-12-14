package org.itstep.service.impl;

import java.util.List;

import javax.management.Query;

import org.itstep.dao.StudentDAO;
import org.itstep.dao.pojo.Student;
import org.itstep.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentDAO studentDAO;
	


	public Student createAndUpdateStudent(Student student){
		return studentDAO.save(student);
	}
	
	public void deleteStudent(String login){
		studentDAO.delete(login);
	}
	
	public List<Student> findStudentsByGroup(String group){
		return studentDAO.findStudentsByGroup(group);
	}

	public List<Student> findAllStudentsByCourse(Integer course){
		return studentDAO.findAllStudentsByCourse(course);
	}

	public Student getStudent(String login) {
		return studentDAO.findOne(login);
	}

	public boolean isUnique(Student student) {
		if(studentDAO.findOne(student.getLogin()) != null) {
			return false;
		}
		return true;
	}

	public List<Student> getAllStudents() {
		return studentDAO.findAll();
	}
	
		
		
	
}
