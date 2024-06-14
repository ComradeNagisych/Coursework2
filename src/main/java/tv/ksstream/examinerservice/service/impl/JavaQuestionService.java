package tv.ksstream.examinerservice.service.impl;

import org.springframework.stereotype.Service;
import tv.ksstream.examinerservice.domain.Question;
import tv.ksstream.examinerservice.service.QuestionService;

import java.util.Collection;
import java.util.Random;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {
    private final Set<Question> questions;

    public JavaQuestionService(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        return add(newQuestion);
    }

    @Override
    public Question add(Question question) {
        return question;
    }


    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return questions.stream().toList();
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        int count = random.nextInt(getAll().size());
        return getAll().stream().toList().get(count);
    }
}
