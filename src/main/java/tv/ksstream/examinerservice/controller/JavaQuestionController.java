package tv.ksstream.examinerservice.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tv.ksstream.examinerservice.domain.Question;
import tv.ksstream.examinerservice.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @GetMapping("/add")
    public Question addQuestion(@RequestParam("question") String question, @RequestParam("answer") String answer){
        return questionService.add(question, answer);
    }
    @GetMapping("/remove")
    public Question removeQuestion(@RequestParam String question, @RequestParam String answer){
        return questionService.remove(question, answer);
    }
    @GetMapping
    public Collection<Question> getQuestions(){
        return questionService.getAll();
    }
}
