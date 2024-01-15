package com.quiz.QuizService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private Long question_id;
    private String question;
    private Long quizId;
}
