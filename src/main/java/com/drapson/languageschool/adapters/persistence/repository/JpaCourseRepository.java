package com.drapson.languageschool.adapters.persistence.repository;

import com.drapson.languageschool.adapters.persistence.entity.CourseEntity;
import com.drapson.languageschool.adapters.persistence.mapper.CourseMapper;
import com.drapson.languageschool.domain.model.Course;
import com.drapson.languageschool.domain.repository.CourseRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JpaCourseRepository implements CourseRepository {

    private final SpringDataCourseRepository springDataCourseRepository;
    private final CourseMapper courseMapper;

    public JpaCourseRepository(SpringDataCourseRepository springDataCourseRepository, CourseMapper courseMapper) {
        this.springDataCourseRepository = springDataCourseRepository;
        this.courseMapper = courseMapper;
    }


    @Override
    public Course save(Course course) {
        CourseEntity courseEntity = courseMapper.toEntity(course);
        CourseEntity savedEntity = springDataCourseRepository.save(courseEntity);
        return courseMapper.toDomain(savedEntity);
    }
}
