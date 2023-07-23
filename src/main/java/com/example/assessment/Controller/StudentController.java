package com.example.assessment.Controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment.Repository.StudentRepo;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @RequestMapping(method = RequestMethod.GET, value = "/students")
    public ResponseEntity<?> getAllStudents() {

        LinkedHashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
        try {
            hashMap.put("status", "success");
            hashMap.put("message", studentRepo.findAll());

            return new ResponseEntity<>(hashMap, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

}
