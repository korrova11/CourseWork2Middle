package pro.sky.java.course2.CourseWork2Middle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.CourseWork2Middle.model.Question;
import pro.sky.java.course2.CourseWork2Middle.service.MathQuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/math")
public class MathQuestionController {


    private final MathQuestionService question2;

    public MathQuestionController(MathQuestionService question) {
        this.question2 = question;
    }

    @GetMapping("/add")
    public Question add(@RequestParam String question, @RequestParam String answer) {

        return question2.add(question, answer);
    }

    @GetMapping("/remove")
    public Question remove(@RequestParam String question, @RequestParam String answer) {
        Question question1 = new Question(question, answer);
        return question2.remove(question1);
    }

    @GetMapping
    public Collection<Question> getQuestions() {
        return question2.getAll();
    }

    @GetMapping("/find")
    public Question find(@RequestParam String question) {
        return question2.find(question);
    }

}

