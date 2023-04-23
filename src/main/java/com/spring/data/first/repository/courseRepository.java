package com.spring.data.first.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;


import com.spring.data.first.entity.Course;

@Repository
public interface courseRepository extends JpaRepository<Course, Long>{

    
    //Native
    @Query(
            value = "SELECT * FROM course s where s.course_id = ?1",
            nativeQuery = true
    )
    Course getStudentByIdNative(Long id);
    //
    @Query(
        value="select * from course",
        nativeQuery = true
    )
    List<Course> getAllCourses();

    @Query(
        value="select * from course",
        nativeQuery = true
    )
    List<Course> getCourseGroupByTitle();

}
