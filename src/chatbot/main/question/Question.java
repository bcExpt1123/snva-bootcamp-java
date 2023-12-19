package chatbot.main.question;

import chatbot.main.Validator;

public class Question {
    public String message;
    public QuestionRel rel;
    public String key;

    public String pattern;

    public boolean isValid(String answer) {
        if (pattern == null || pattern.isEmpty()) {
            return true;
        }
        return Validator.isValid(answer, pattern);
    }

    public Question(String message, QuestionRel rel, String key) {
        this.message = message;
        this.rel = rel;
        this.key = key;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

