package com.question.QuestionService.services;

import com.question.QuestionService.entities.Question;
import java.util.*;
public interface QuestionService {
     Question add(Question question);
     List<Question> getAll();
        Question getById(Long question_id);

        List<Question>getAllQuestionbyQuizId(Long quizId);
}
