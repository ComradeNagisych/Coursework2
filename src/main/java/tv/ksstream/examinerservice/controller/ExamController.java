package tv.ksstream.examinerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tv.ksstream.examinerservice.domain.Question;
import tv.ksstream.examinerservice.service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private ExaminerService examinerService;
    public ExamController (ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/getQuestions")
    public Collection<Question> getQuestions (@RequestParam Integer amount) {
        return examinerService.getQuestions(amount);
    }
}
