package tv.ksstream.examinerservice.service.impl;

import org.springframework.stereotype.Service;
import tv.ksstream.examinerservice.domain.Question;
import tv.ksstream.examinerservice.exception.NoQuestionsPresent;
import tv.ksstream.examinerservice.service.ExaminerService;
import tv.ksstream.examinerservice.service.QuestionService;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private Random random;
    private List<QuestionService> questionService;

    public ExaminerServiceImpl(QuestionService questionService){
        this.questionService = (List<QuestionService>) questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount <= 0) {
            throw new NoQuestionsPresent();
        }
        Set<Question> questionSet = new HashSet<>(amount);
        while (questionSet.size() < amount) {
            Random random = new Random();
            int number = random.nextInt(0, questionService.size());
            questionSet.add(questionService.get(number).getRandomQuestion());
        }
        return questionSet;
    }
}
