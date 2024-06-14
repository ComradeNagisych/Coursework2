package tv.ksstream.examinerservice.service.impl;

import org.springframework.stereotype.Service;
import tv.ksstream.examinerservice.service.QuestionService;

import java.util.Random;
@Service
public class ExaminerServiceImpl {
    Random random;
    QuestionService questionService;
    public ExaminerServiceImpl(QuestionService questionService){

    }

}
