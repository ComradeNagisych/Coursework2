package tv.ksstream.examinerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoMoreQuestionsAvailable extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "There's no more questions in the base.";
    public NoMoreQuestionsAvailable() {
        super(DEFAULT_MESSAGE);
    }
    public NoMoreQuestionsAvailable(String message) {
        super(message);
    }
}