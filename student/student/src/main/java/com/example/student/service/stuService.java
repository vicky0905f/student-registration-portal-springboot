package com.example.student.service;

import java.util.List;

import com.example.student.model.student;
import com.example.student.repository.stuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class stuService {
    @Autowired
    stuRepository stuRepository;

    public List<student> getAllData(){
        return stuRepository.findAll();
    }

    public void save(student b){

        stuRepository.save(b);

    }


    public void deleteById(int id) {
        stuRepository.deleteById(id);
    }

    public student getStudentById(int id){
        return stuRepository.findById(id).get();
    }



}