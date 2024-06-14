package tv.ksstream.examinerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoQuestionsPresent extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "No questions in the base";
    public NoQuestionsPresent() {
        super(DEFAULT_MESSAGE);
    }
    public NoQuestionsPresent(String message) {
        super(message);
    }
}
