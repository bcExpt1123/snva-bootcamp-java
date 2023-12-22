package onlinequiz.qa;

public class QuestionOption implements IQuestionOption{
    private String key;
    private String name;
    private boolean answer;
    QuestionOption(String key, String name, boolean isAnswer) {
        this.key = key;
        this.name = name;
        answer = isAnswer;
    }
    public String getName() {
        return name;
    }

    @Override
    public String getKey() {
        return key;
    }

    public boolean isAnswer() {
        return answer;
    }
}
