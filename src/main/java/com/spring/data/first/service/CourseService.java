package com.spring.data.first.service;


import java.util.*;
import java.util.Optional;

import com.spring.data.first.entity.*;

public interface CourseService {

    public Course saveCourse(Course course);

    public List<Course> getAllCourses();

    public Optional<Course> findById(Long Id);

    public String deleteById(Long Id);

    
}
