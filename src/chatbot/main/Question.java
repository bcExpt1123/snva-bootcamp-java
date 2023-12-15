package chatbot.main;

public class Question {
    public String message;
    public QuestionRel rel;
    public String key;

    public Question(String message, QuestionRel rel, String key ) {
        this.message = message;
        this.rel = rel;
        this.key = key;
    }
}

