package onlinequiz.qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionList implements IQuestionList {

    private List<Question> questions;

    public QuestionList() {
        questions = new ArrayList<>();
        initialize();
    }

    @Override
    public void addQuestion(Question question) {
        questions.add(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questions;
    }

    @Override
    public List<Question> getQuestions(int n) {
        if (n == 0) {
            return questions;
        } else {
            List<Question> questions1 = questions;
            Collections.shuffle(questions1);
            List<Question> randomQuestions = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                randomQuestions.add(questions1.get(i));
            }

            return randomQuestions;
        }
    }

    private void initialize() {
        Question question = new Question("What is the capital city of France?");
        QuestionOption optionA = new QuestionOption("A", "Paris", true);
        QuestionOption optionB = new QuestionOption("B", "London", false);
        QuestionOption optionC = new QuestionOption("C", "Rome", false);
        QuestionOption optionD = new QuestionOption("D", "Madrid", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("Who painted the Mona Lisa?");
        optionA = new QuestionOption("A", "Michelangelo", false);
        optionB = new QuestionOption("B", "Leonardo da Vinci", true);
        optionC = new QuestionOption("C", "Vincent van Gogh", false);
        optionD = new QuestionOption("D", "Pablo Picasso", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("What is the chemical symbol for gold?");
        optionA = new QuestionOption("A", "Au", true);
        optionB = new QuestionOption("B", "Ag", false);
        optionC = new QuestionOption("C", "Fe", false);
        optionD = new QuestionOption("D", "Hg", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("Which planet is known as the Red Planet?");
        optionA = new QuestionOption("A", "Mars", true);
        optionB = new QuestionOption("B", "Venus", false);
        optionC = new QuestionOption("C", "Jupiter", false);
        optionD = new QuestionOption("D", "Saturn", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("Which country won the FIFA World Cup in 2018?");
        optionA = new QuestionOption("A", "Germany", false);
        optionB = new QuestionOption("B", "Brazil", false);
        optionC = new QuestionOption("C", "France", true);
        optionD = new QuestionOption("D", "Argentina", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("Which scientist developed the theory of relativity?");
        optionA = new QuestionOption("A", "Isaac Newton", false);
        optionB = new QuestionOption("B", "Albert Einstein", true);
        optionC = new QuestionOption("C", "Galileo Galilei", false);
        optionD = new QuestionOption("D", "Nikola Tesla", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("What is the largest planet in our solar system?");
        optionA = new QuestionOption("A", "Jupiter", true);
        optionB = new QuestionOption("B", "Saturn", false);
        optionC = new QuestionOption("C", "Mars", false);
        optionD = new QuestionOption("D", "Earth", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("Who wrote the famous play \"Romeo and Juliet\"?");
        optionA = new QuestionOption("A", "William Shakespeare", true);
        optionB = new QuestionOption("B", "Oscar Wilde", false);
        optionC = new QuestionOption("C", "Jane Austen", false);
        optionD = new QuestionOption("D", "Mark Twain", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("What is the chemical symbol for oxygen?");
        optionA = new QuestionOption("A", "O", true);
        optionB = new QuestionOption("B", "C", false);
        optionC = new QuestionOption("C", "H", false);
        optionD = new QuestionOption("D", "N", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("What is the capital city of Australia?");
        optionA = new QuestionOption("A", "Sydney", false);
        optionB = new QuestionOption("B", "Melbourne", false);
        optionC = new QuestionOption("C", "Canberra", true);
        optionD = new QuestionOption("D", "Perth", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("Who painted the famous artwork \"The Starry Night\"?");
        optionA = new QuestionOption("A", "Vincent van Gogh", true);
        optionB = new QuestionOption("B", "Pablo Picasso", false);
        optionC = new QuestionOption("C", "Leonardo da Vinci", false);
        optionD = new QuestionOption("D", "Salvador Dali", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("What is the largest ocean on Earth?");
        optionA = new QuestionOption("A", "Pacific Ocean", true);
        optionB = new QuestionOption("B", "Atlantic Ocean", false);
        optionC = new QuestionOption("C", "Indian Ocean", false);
        optionD = new QuestionOption("D", "Arctic Ocean", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("What is the largest organ in the human body?");
        optionA = new QuestionOption("A", "Liver", false);
        optionB = new QuestionOption("B", "Brain", false);
        optionC = new QuestionOption("C", "Skin", true);
        optionD = new QuestionOption("D", "Heart", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("Who invented the telephone?");
        optionA = new QuestionOption("A", "Alexander Graham Bell", true);
        optionB = new QuestionOption("B", "Thomas Edison", false);
        optionC = new QuestionOption("C", "Nikola Tesla", false);
        optionD = new QuestionOption("D", "Isaac Newton", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("What is the tallest mountain in the world?");
        optionA = new QuestionOption("A", "Mount Everest", true);
        optionB = new QuestionOption("B", "Mount Kilimanjaro", false);
        optionC = new QuestionOption("C", "Mount Fuji", false);
        optionD = new QuestionOption("D", "Mount McKinley", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("What is the chemical symbol for sodium?");
        optionA = new QuestionOption("A", "Na", true);
        optionB = new QuestionOption("B", "So", false);
        optionC = new QuestionOption("C", "K", false);
        optionD = new QuestionOption("D", "Mg", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("Who is the author of the Harry Potter book series?");
        optionA = new QuestionOption("A", "J.K. Rowling", true);
        optionB = new QuestionOption("B", "Stephen King", false);
        optionC = new QuestionOption("C", "George R.R. Martin", false);
        optionD = new QuestionOption("D", "Dan Brown", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("Which famous scientist developed the theory of evolution by natural selection?");
        optionA = new QuestionOption("A", "Charles Darwin", true);
        optionB = new QuestionOption("B", "Albert Einstein", false);
        optionC = new QuestionOption("C", "Marie Curie", false);
        optionD = new QuestionOption("D", "Isaac Newton", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("What is the largest desert in the world?");
        optionA = new QuestionOption("A", "Sahara Desert", true);
        optionB = new QuestionOption("B", "Gobi Desert", false);
        optionC = new QuestionOption("C", "Atacama Desert", false);
        optionD = new QuestionOption("D", "Kalahari Desert", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

        question = new Question("Who painted the famous artwork \"The Last Supper\"?");
        optionA = new QuestionOption("A", "Leonardo da Vinci", true);
        optionB = new QuestionOption("B", "Pablo Picasso", false);
        optionC = new QuestionOption("C", "Vincent van Gogh", false);
        optionD = new QuestionOption("D", "Michelangelo", false);
        question.addOption(optionA);
        question.addOption(optionB);
        question.addOption(optionC);
        question.addOption(optionD);
        addQuestion(question);

    }
}
