package pro.sky.java.course2.CourseWork2Middle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.CourseWork2Middle.model.Question;
import pro.sky.java.course2.CourseWork2Middle.service.ExaminerService;

import java.util.Set;

@RestController
@RequestMapping("/get")

public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {

        this.examinerService = examinerService;
    }

    @GetMapping("{amount}")
    public Set<Question> getQuestions(@PathVariable int amount) {
        return examinerService.getQuestion(amount);
    }

}

