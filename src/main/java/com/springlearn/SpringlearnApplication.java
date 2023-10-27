package com.springlearn;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springlearn.student.Student;

@RestController
@SpringBootApplication
public class SpringlearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringlearnApplication.class, args);
	}

	@GetMapping
	public List hello() {
		return List.of(

				new Student(1L, "Sumit Kumar", "sk@gm.com", LocalDate.of(1998, 04, 10), 21),
				new Student(2L, "Suniti Kumar", "ski@gm.com", LocalDate.of(1998, 04, 10), 21)

		);
	}
}
