package com.spring.data.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.first.entity.Course;


import com.spring.data.first.service.CourseService;

@RestController
@RequestMapping("/course")
@CrossOrigin
public class CourseController {


    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public String add (@RequestBody Course course){
        courseService.saveCourse(course);
        return "New Course is added";
    }
    

    @GetMapping("/getAll")
    public List<Course> getAllCourse(){
        return courseService.getAllCourses();
        
    }
}
