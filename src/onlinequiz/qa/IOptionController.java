package onlinequiz.qa;

import java.util.List;

public interface IOptionController {
    void addOption(QuestionOption option);
    List<QuestionOption> getOptions();
}
