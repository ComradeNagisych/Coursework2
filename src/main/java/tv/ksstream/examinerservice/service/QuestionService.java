package tv.ksstream.examinerservice.service;

import tv.ksstream.examinerservice.domain.Question;

import java.util.Collection;

public interface QuestionService {
    Question add (String question, String answer);
    Question add (Question question);
    Question remove (String question, String answer);
    Question remove (Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();

}
