package org.itstep.service;

import java.util.List;

import org.itstep.dao.pojo.Group;
import org.itstep.dao.pojo.Student;
import org.itstep.dao.pojo.Teacher;

public interface TeacherService {
	
	public List<Teacher> getAllTeachers();
	
	public Teacher getTeacher(String login);
	
	public Teacher createAndUpdateTeacher(Teacher teacher);
	
	public void deleteTeacher(String login);

	boolean isUnique(Teacher teacher);
}
