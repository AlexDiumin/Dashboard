package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.LessonDAO;
import org.itstep.dao.pojo.Group;
import org.itstep.dao.pojo.Lesson;
import org.itstep.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl implements LessonService{

	@Autowired
	LessonDAO lessonDAO;
	
	public Lesson saveAndUpdate(Lesson lesson) {
		return lessonDAO.saveAndFlush(lesson);
	}

	public void delete(Long id) {
		lessonDAO.delete(id);		
	}

	public List<Lesson> getLessonsByGroupAndStartTime(String group, Long startTime) {
		return lessonDAO.getLessonsByGroupAndStartTime(group, startTime);
	}

	public List<Lesson> getLessonsByTeacherAndStartTime(String teacher, Long startTime) {
		
		return lessonDAO.getLessonsByTeacherAndStartTime(teacher, startTime);
	}

	public List<Lesson> getLessonsForGroupForPeriod(String group, Long start, Long length) {
		Long end = start+length;
		return lessonDAO.getLessonsForGroupForPeriod(group, start, end);
	}

	public List<Lesson> getLessonsForCourseForPeriod(Integer course, Long start, Long length) {
		Long end = start+length;
		return lessonDAO.getLessonsForCourseForPeriod(course, start, end);
	}



	public boolean isUnique(Lesson lesson) {
		if(lessonDAO.findOne(lesson.getLessonId()) != null) {
			return false;
		}
		return true;
	}

	public List<Lesson> getLessonsForTeacherForPeriod(String teacherLogin, Long start, Long length) {
		Long end = start+length;
		return lessonDAO.getLessonsForTeacherForPeriod(teacherLogin, start, end);
	}

	public Lesson getLesson(Long lessonId) {
		return lessonDAO.findOne(lessonId);
	}

	public List<Lesson> getAllLessons() {
		return lessonDAO.findAll();
	}


}
