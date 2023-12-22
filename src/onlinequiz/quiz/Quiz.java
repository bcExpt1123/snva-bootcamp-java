package onlinequiz.quiz;

import onlinequiz.qa.Question;
import onlinequiz.qa.QuestionList;
import onlinequiz.qa.QuestionOption;

import java.util.List;

public class Quiz {
    List<Question> questions;

    public Quiz() {
        QuestionList questionList = new QuestionList();
        questions = questionList.getQuestions(5);
    }

    public void run() {
        int count = 0;
        while (count < questions.size()) {
            Question q = questions.get(count);
            List<QuestionOption> qOptions = q.getOptions();
            System.out.println(q.getDescription());
            for (QuestionOption qo : qOptions) {
                System.out.println(qo.getKey() + ": " +  qo.getName());
            }
            count++;
        }
    }
}
