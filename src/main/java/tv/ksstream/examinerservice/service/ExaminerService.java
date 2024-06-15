package tv.ksstream.examinerservice.service;

import tv.ksstream.examinerservice.domain.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions (int amount);
}
