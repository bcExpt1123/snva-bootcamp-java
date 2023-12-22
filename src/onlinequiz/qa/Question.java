package onlinequiz.qa;

import java.util.ArrayList;
import java.util.List;

public class Question implements IQuestion, IOptionController {
    private String description;
    private List<QuestionOption> options ;
//    private IQuestionOption answer;

    Question(String description) {
        this.description = description;
        options = new ArrayList<>();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void addOption(QuestionOption option) {
        options.add(option);
    }

    @Override
    public List<QuestionOption> getOptions() {
        return options;
    }
}
