package pro.sky.java.course2.CourseWork2Middle.service;

import pro.sky.java.course2.CourseWork2Middle.model.Question;

import java.util.Set;

public interface ExaminerService {
    Set<Question> getQuestion(int amount);
}
