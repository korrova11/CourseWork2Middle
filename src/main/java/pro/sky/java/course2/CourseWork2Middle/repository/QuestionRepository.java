package pro.sky.java.course2.CourseWork2Middle.repository;

import pro.sky.java.course2.CourseWork2Middle.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(String question, String answer);

    Question remove(Question question);

    Question find(String question);

    Collection<Question> getAll();
}

