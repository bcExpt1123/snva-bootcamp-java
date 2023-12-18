package chatbot.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question {
    public String message;
    public QuestionRel rel;
    public String key;

    public String pattern;

    public boolean isValid(String answer) {
        if(pattern == null || pattern.isEmpty()) {
            return true;
        }
        return Validator.isValid(answer, pattern);
    }

    public Question(String message, QuestionRel rel, String key ) {
        this.message = message;
        this.rel = rel;
        this.key = key;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}

