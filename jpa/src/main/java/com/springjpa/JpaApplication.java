package com.springjpa;

import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {
	String jd;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);

		// hello(null, () -> {
		// System.out.println("ssss");
		// });
		// System.out.println(convertName.apply("usnjedje"));
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student s = new Student("Firstname", "Lastname", "fl@gmail.com", 23);
			studentRepository.save(s);
		};
	}

	static void hello(String name, Runnable x) {
		if (name != null) {
			System.out.println(name);
		} else {
			x.run();
		}
	}

	static Function<String, String> convertName = name -> {
		if (name.isBlank()) {
			throw new IllegalStateException("Invalid name");
		}
		return name.toUpperCase();
	};

}
