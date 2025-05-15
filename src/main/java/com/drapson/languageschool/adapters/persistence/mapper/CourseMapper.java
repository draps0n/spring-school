package com.drapson.languageschool.adapters.persistence.mapper;

import com.drapson.languageschool.adapters.persistence.entity.CourseEntity;
import com.drapson.languageschool.domain.model.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {

    public CourseEntity toEntity(Course course) {
        return CourseEntity.builder()
                .id(course.getId())
                .availableSeats(course.getAvailableSeats())
                .description(course.getDescription())
                .build();
    }

    public Course toDomain(CourseEntity courseEntity) {
        return new Course(
                courseEntity.getId(),
                courseEntity.getAvailableSeats(),
                courseEntity.getDescription()
        );
    }
}
