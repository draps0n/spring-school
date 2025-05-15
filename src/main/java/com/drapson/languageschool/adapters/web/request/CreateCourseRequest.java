package com.drapson.languageschool.adapters.web.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record CreateCourseRequest(
        @NotNull(message = "Available seats are mandatory")
        @Positive(message = "Available seats must be greater than 0")
        int availableSeats,

        @NotBlank(message = "Course description is mandatory")
        @Size(min = 1, max = 250, message = "Course description must be between 1 and 250 characters")
        String description
) {

}
