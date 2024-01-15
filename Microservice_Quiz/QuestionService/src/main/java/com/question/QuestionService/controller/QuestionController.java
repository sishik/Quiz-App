package com.question.QuestionService.controller;

import com.question.QuestionService.services.QuestionService;
import org.springframework.web.bind.annotation.*;
import com.question.QuestionService.entities.Question;
import java.util.List;
@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    //create question
    @PostMapping()
    Question add(@RequestBody Question question){
        return questionService.add(question);
    }
    @GetMapping()
    List<Question>getAll(){
        return questionService.getAll();
    }
    @GetMapping("/{question_id}")
    Question getByID(@PathVariable Long question_id){
        return questionService.getById(question_id);
    }
    @GetMapping("/quiz/{quiz_id}")
    List<Question>getAllQuestionByQuizId(@PathVariable Long quiz_id){
        return questionService.getAllQuestionbyQuizId(quiz_id);
    }
}
