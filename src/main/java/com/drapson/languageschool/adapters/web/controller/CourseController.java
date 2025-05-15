package com.drapson.languageschool.adapters.web.controller;

import com.drapson.languageschool.adapters.web.request.CreateCourseRequest;
import com.drapson.languageschool.application.command.CreateCourseCommand;
import com.drapson.languageschool.application.usecase.impl.CreateCourseService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CreateCourseService createCourseService;

    public CourseController(CreateCourseService createCourseService) {
        this.createCourseService = createCourseService;
    }

    @GetMapping
    public String getCourses() {
        return "List of courses";
    }

    @PostMapping
    public String createCourse(@Valid @RequestBody CreateCourseRequest request) {
        CreateCourseCommand command = new CreateCourseCommand(
                request.availableSeats(),
                request.description()
        );
        Long createdId = createCourseService.execute(command);

        return "Course created with id: " + createdId;
    }
}
