package tv.ksstream.examinerservice.service;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tv.ksstream.examinerservice.domain.Question;
import tv.ksstream.examinerservice.service.impl.JavaQuestionService;

import java.util.Collection;
import java.util.Set;

public class JavaQuestionServiceTest {
    private QuestionService service = new JavaQuestionService();
    @Test
    public void addNewQuestion() {
        Question question = service.add("Test question", "Test answer");
        Assertions.assertEquals("Test question", question.getQuestion());
        Assertions.assertEquals("Test answer", question.getAnswer());
        service.add(question);
    }
    @Test
    public void removeQuestion() {
        Question question = service.add("Test question 2", "Test answer 2");
        Assertions.assertEquals("Test question 2", question.getQuestion());
        Assertions.assertEquals("Test answer 2", question.getAnswer());
        service.remove(question);
    }
    @Test
    public void getAllQuestions() {
        Question question = service.add("Test question 3", "Test answer 3");
        Question question1 = service.add("Test question 4", "Test answer 4");
        Collection<Question> questions = service.getAll();
        Assertions.assertEquals(2, questions.size());
        MatcherAssert.assertThat(questions, Matchers.containsInAnyOrder(question, question1));
    }
    @Test
    public void getRandomQuestion() {
        Question question = service.add("Test question 5", "Test answer 5");
        Question question1 = service.add("Test question 6", "Test answer 6");
        Collection<Question> questions = (Collection<Question>) service.getRandomQuestion();
    }
}
