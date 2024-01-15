package com.quiz.QuizService.controller;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.services.QuizService;
import java.util.List;

import jakarta.persistence.GeneratedValue;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }
    //create
    @PostMapping()
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }
    //read All
    @GetMapping()
    public List<Quiz> getAll(){
        return quizService.getAll();
    }
    @GetMapping("/{id}")
    public Quiz get(@PathVariable Long id){
        return quizService.getById(id);
    }
}
