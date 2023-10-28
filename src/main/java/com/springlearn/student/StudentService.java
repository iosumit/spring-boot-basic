package com.springlearn.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Component can also be used 
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println(student.toString());
        Optional<Student> studentEmail = studentRepository
                .findStudentByEmail(student.getEmail());

        if (studentEmail.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exits = studentRepository.existsById(studentId);
        if (!exits) {
            throw new IllegalStateException("Student with id " + studentId + " doesn't exits");
        }
        studentRepository.deleteById(studentId);
    }
}
