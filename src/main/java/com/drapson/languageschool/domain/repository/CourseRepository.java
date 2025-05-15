package com.drapson.languageschool.domain.repository;

import com.drapson.languageschool.domain.model.Course;

public interface CourseRepository {
    Course save(Course course);
}
