package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.TeacherDAO;
import org.itstep.dao.pojo.Group;
import org.itstep.dao.pojo.Teacher;
import org.itstep.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	TeacherDAO teacherDAO;

	
	public Teacher createAndUpdateTeacher(Teacher teacher) {
		return teacherDAO.saveAndFlush(teacher);
	}

	public void deleteTeacher(String login) {
		teacherDAO.delete(login);
		
	}


	public Teacher getTeacher(String login) {
		return teacherDAO.findOne(login);
	}

	public boolean isUnique(Teacher teacher) {
		if(teacherDAO.findOne(teacher.getLogin()) != null) {
			return false;
		}
		return true;
	}

	public List<Teacher> getAllTeachers() {
		return teacherDAO.findAll();
	}
}
