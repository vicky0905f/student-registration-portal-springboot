package com.example.student.controller;



import java.util.List;

import com.example.student.model.student;
import com.example.student.service.stuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class stuController {
    @Autowired
    stuService stuService;

    @GetMapping("/")
    public String home(){
        return "home";
    }


    @GetMapping("/about")
    public String about(){
        return "about";
    }


    @GetMapping("/registered_data")
    public ModelAndView getAllData(){
        List<student>list=stuService.getAllData();
        return new ModelAndView("studentList","student",list);

    }



    @PostMapping("/save")
    public String addData(@ModelAttribute student b){
        stuService.save(b);
        return "submitted";

    }


    @RequestMapping("delete/{id}")
    public String delete(@PathVariable ("id")int id){
        stuService.deleteById(id);
        return "redirect:/registered_data";
    }


    @RequestMapping("edit/{id}")
    public String edit(@PathVariable("id")  int id ,Model model){
        student b=stuService.getStudentById(id);
        model.addAttribute("student", b);
        return "stuEdit";
    }


}

