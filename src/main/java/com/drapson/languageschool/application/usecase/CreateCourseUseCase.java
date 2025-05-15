package com.drapson.languageschool.application.usecase;

import com.drapson.languageschool.application.command.CreateCourseCommand;

public interface CreateCourseUseCase {
    Long execute(CreateCourseCommand command);
}
