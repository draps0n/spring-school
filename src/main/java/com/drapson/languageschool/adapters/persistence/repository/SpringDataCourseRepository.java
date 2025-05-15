package com.drapson.languageschool.adapters.persistence.repository;

import com.drapson.languageschool.adapters.persistence.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCourseRepository extends JpaRepository<CourseEntity, Long> {
}
