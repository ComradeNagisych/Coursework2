package tv.ksstream.examinerservice.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tv.ksstream.examinerservice.domain.Question;
import tv.ksstream.examinerservice.service.impl.ExaminerServiceImpl;

import java.util.Collection;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {
    @InjectMocks
    private ExaminerServiceImpl examinerService;
    @Mock
    private QuestionService questionService;
    private List<Question> questions = List.of(
            new Question("Who created Java language?", "James Gosling and Sun Microsystems"),
            new Question("What is placed at the end of a string of code?", "Semi-colon (;)"),
            new Question("What kind of data is presented with int?", "Primitive"),
            new Question("What is an array?", "Group of data"),
            new Question("What do we use to test code?", "Mocks")
    );
    @BeforeEach
    public void init() {
        questionService = Mockito.mock(QuestionService.class);
        examinerService = new ExaminerServiceImpl(questionService);
    }
    @Test
    public void getQuestions() {
        when(questionService.getAll()).thenReturn(questions);
        Question question = (Question) examinerService.getQuestions(1);
        Assertions.assertEquals("Who created Java language?", question.getQuestion());
        Assertions.assertEquals("James Gosling and Sun Microsystems", question.getAnswer());
    }
}
