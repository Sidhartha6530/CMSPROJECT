package com.klef.jfsd.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.klef.jfsd.springboot.service.CourseService;

@Controller
public class CourseController 
{
	@Autowired
	private CourseService courseService;
	

}
