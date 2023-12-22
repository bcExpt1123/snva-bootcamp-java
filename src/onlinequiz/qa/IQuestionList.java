package onlinequiz.qa;

import java.util.List;

public interface IQuestionList {

    List<Question> getQuestions(int n);
    void addQuestion(Question question);
    List<Question> getAllQuestions();
}
