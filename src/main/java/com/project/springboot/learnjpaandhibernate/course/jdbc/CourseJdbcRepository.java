package com.project.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springtemplate;
	
	private static String INSERT_QUERY=
			"""
			insert into course(id,name,author)
			values(?,?,?);	
			""";
	
	public void insert(Course course)
	{
		springtemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
	}
	
}
