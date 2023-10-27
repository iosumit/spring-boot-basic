package com.springlearn.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @GetMapping
    public List getStudents() {
        return List.of(

                new Student(1L, "Sumit Kumar", "sk@gm.com", LocalDate.of(1998, 04, 10), 21),
                new Student(2L, "Suniti Kumar", "ski@gm.com", LocalDate.of(1998, 04, 10), 21)

        );
    }
}
