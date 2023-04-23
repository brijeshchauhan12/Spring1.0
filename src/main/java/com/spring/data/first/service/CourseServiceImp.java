package com.spring.data.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.data.first.repository.courseRepository;
import com.spring.data.first.entity.Course;
import java.util.*;

@Service
public class CourseServiceImp implements CourseService {
    
    @Autowired
    private courseRepository courseRepository;

    @Override
    public Course saveCourse( Course course){
        return courseRepository.save(course);

    }

    @Override
    public List<Course> getAllCourses(){
        return courseRepository.getAllCourses();
    }

    @Override
    public Optional<Course> findById(Long id){
        return courseRepository.findById(id);
    }

    @Override

    public String deleteById(Long id){
        courseRepository.deleteById(id);
        return "deleted"+id;
    }
}
