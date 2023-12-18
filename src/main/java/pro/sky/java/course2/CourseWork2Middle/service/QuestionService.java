package pro.sky.java.course2.CourseWork2Middle.service;

import pro.sky.java.course2.CourseWork2Middle.model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question remove(Question question);

    Collection<Question> getAll();

    Question find(String question);

    Question getRandomQuestion();

    int size();
}

