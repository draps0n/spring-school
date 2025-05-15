package com.drapson.languageschool.config;

import com.drapson.languageschool.application.usecase.impl.CreateCourseService;
import com.drapson.languageschool.domain.repository.CourseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public CreateCourseService courseService(CourseRepository courseRepository) {
        return new CreateCourseService(courseRepository);
    }
}
