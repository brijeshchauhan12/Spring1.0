package com.spring.data.first.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.data.first.entity.Course;



import lombok.ToString;


@ToString
@SpringBootTest
class CourseRepositoryTest {
    
    @Autowired
    public courseRepository courseRepository;

    @Test
    public void printCourse(){
        List<Course> courses=courseRepository.findAll();
        
        System.out.println("courses"+ courses);

    }

    @Test
    public void saveCourseInTable(){
        Course course=Course.builder()
                 .title("Biopsy")
                 .credit(1000)
                 .build();
        courseRepository.save(course);
        System.out.println("student saved");
    }

    @Test
    public void printCourseIdNative(){
        Course course=courseRepository.getStudentByIdNative(
            7L
        );


      System.out.println("the fetched course from database is "+course);
        
    }

    @Test
    public void printCourseGroupByTitle(){
        List<Course>  course=courseRepository.getCourseGroupByTitle();

        System.out.println("the unique course are with their count"+ course);
    }

}
