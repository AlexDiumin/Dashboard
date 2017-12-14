package org.itstep;


import org.itstep.controller.LessonController;
import org.itstep.dao.pojo.Lesson;
import org.itstep.service.impl.LessonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class App 
{
	
	
    public static void main( String[] args ){
    	SpringApplication.run(App.class, args);
    	
//    	Lesson lesson = new Lesson();
//   	 lesson.setGroup("group");
//   	 lesson.setLength(22l);
//   	 lesson.setLessonStart(0l);
//   	 lesson.setRoom("room");
//   	 lesson.setSubject("subject");
//   	 lesson.setTeacher("The Teacher");
//   	 lesson.setDescription("asd");
//    	Gson g = new Gson();
//    	String lg = g.toJson(lesson);
//    	System.out.println(lg);
    	

    }
}
