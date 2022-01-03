package com.example.dancestudentmanagementsystem;

import com.example.dancestudentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

/*        Student student1 = new Student("Peter", "Schmidt", "peter.schmidt1@gmail.com", "Hip Hop Lvl 1");
        studentRepository.save(student1);

        Student student2 = new Student("Bertha", "Ahlmann", "a.bertha@gmail.com", "Hip Hop Lvl 2");
        studentRepository.save(student2);

        Student student3 = new Student("Hans", "Winzer", "winzer.hans@gmail.com", "Hip Hop Lvl 1");
        studentRepository.save(student3);
        */

    }
}
