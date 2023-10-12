package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
CommandLineRunner commandLineRunner(StudentRepository studentRepository)
{
return args -> {
Student mariam = new Student("Mariam@gmail.com", "Mariam", LocalDate.of(2000, Month.JANUARY, 5));
Student thuong=  new Student("Thuong@gmail.com", "Thuong", LocalDate.of(2000, Month.FEBRUARY, 5));
studentRepository.saveAll(List.of(mariam, thuong));
};
}

}
