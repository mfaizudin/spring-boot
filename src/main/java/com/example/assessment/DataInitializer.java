package com.example.assessment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.assessment.Entity.Student;
import com.example.assessment.Repository.StudentRepo;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {

        try {
            List<Student> arr = new ArrayList<>();

            Student student1 = new Student("John", "Doe", "Account", new Date(), new Date());
            Student student2 = new Student("Susan", "Connor", "Marketing", new Date(), new Date());
            Student student3 = new Student("Faizudin", "Kamarudin", "Computer Science", new Date(), new Date());

            arr.add(student1);
            arr.add(student2);
            arr.add(student3);

            studentRepo.saveAll(arr);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
