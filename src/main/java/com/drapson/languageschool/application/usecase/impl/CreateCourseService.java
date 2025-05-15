package com.drapson.languageschool.application.usecase.impl;

import com.drapson.languageschool.application.command.CreateCourseCommand;
import com.drapson.languageschool.application.usecase.CreateCourseUseCase;
import com.drapson.languageschool.domain.model.Course;
import com.drapson.languageschool.domain.repository.CourseRepository;

public class CreateCourseService implements CreateCourseUseCase {

    private final CourseRepository courseRepository;

    public CreateCourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Long execute(CreateCourseCommand command) {
        Course course = new Course(null, command.availableSeats(), command.description());
        Course createdCourse = courseRepository.save(course);

        return createdCourse.getId();
    }
}
