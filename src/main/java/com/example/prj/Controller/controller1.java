package com.example.prj.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/tim1")
public class controller1 {
    @GetMapping("/trener")
    public ModelAndView html() {

        return new ModelAndView("trener");
    }

    @GetMapping("/xaxacox")
    public ModelAndView html1() {

        return new ModelAndView("xaxacox");
    }

    @GetMapping("/haxtanakner")
    public ModelAndView html32() {

        return new ModelAndView("haxtanakner");
    }

}