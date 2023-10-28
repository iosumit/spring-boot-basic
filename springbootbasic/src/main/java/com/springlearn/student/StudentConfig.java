package com.springlearn.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sumit = new Student(1L, "Sumit Kumar", "sk@gm.com", LocalDate.of(2000, 8, 10));
            Student alex = new Student(2L, "Alex Kumar", "alex@gm.com", LocalDate.of(2001, 8, 10));

            repository.saveAll(List.of(sumit, alex));

        };
    }
}
