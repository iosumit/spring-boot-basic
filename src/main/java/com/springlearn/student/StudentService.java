package com.springlearn.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component can also be used 
@Service
public class StudentService {
    public List getStudents() {
        return List.of(

                new Student(1L, "Sumit Kumar", "sk@gm.com", LocalDate.of(2000, 04, 10), 21),
                new Student(2L, "Suniti Kumari", "ski@gm.com", LocalDate.of(2001, 04, 10), 21)

        );
    }
}
