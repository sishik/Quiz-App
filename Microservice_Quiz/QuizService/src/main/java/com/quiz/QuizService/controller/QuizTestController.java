package com.quiz.QuizService.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/quiz-test")
public class QuizTestController {

        @GetMapping
        public String test(){
            return "Quiz Test Controller";
        }

}
