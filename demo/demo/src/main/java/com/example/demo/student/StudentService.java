package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents()
    {
        return studentRepository.findUsersWithName("Thuong");
    }

    public void addNewStudent(Student student) {
        Optional<Student> existStudent = studentRepository.findStudentByEmail(student.getEmail());
        if(existStudent.isPresent())
        {
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }
}
