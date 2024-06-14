package tv.ksstream.examinerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RemovalImpossible extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Question not found, removal impossible";
    public RemovalImpossible() {
        super(DEFAULT_MESSAGE);
    }
    public RemovalImpossible(String message) {
        super(message);
    }
}
