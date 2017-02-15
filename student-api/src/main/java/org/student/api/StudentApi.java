package org.student.api;

import java.util.List;

import org.student.api.dto.StudentDTO;

public interface StudentApi {
    List<StudentDTO> listStudents();
}
