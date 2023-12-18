package chatbot.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Bot {
    private final Scanner scanner;
    private final User user;
    private final Car car;
    private final ArrayList<Question> questions;

    public Bot() {
        this.scanner = new Scanner(System.in);
        this.user = new User();
        this.car = new Car();
        this.questions = new ArrayList<Question>();
        this.questions.add(new Question("Hi, Welcome! My name is Jenny. Can I ask your name?", QuestionRel.USER, "name"));
    }

    public void storeQuestions(String name) {
        this.questions.add(new Question("Hey " + name + ", How are you?", QuestionRel.USER, ""));
        this.questions.add(new Question("That sounds good, how may I help you?", QuestionRel.USER, ""));
        this.questions.add(new Question("Sure, May I ask which state are you reside in?", QuestionRel.USER, "state"));
        this.questions.add(new Question("In which city are you currently located?", QuestionRel.USER, "city"));
        this.questions.add(new Question("What is the model of your car?", QuestionRel.CAR, "model"));
        this.questions.add(new Question("What is the MSRP of your car?", QuestionRel.CAR, "MSRP"));
        this.questions.add(new Question("What are the taxes on your car?", QuestionRel.CAR, "taxes"));
    }

    public void conversation() {
        int count = 0;
        while (questions.size() > count) {
            String answer = ask(questions.get(count));
            count++;
            if (count == 1) {
                storeQuestions(answer);
            }
        }

        displayInformation();
    }

    private String ask(Question question) {
        System.out.print("Bot: ");
        System.out.println(question.message);

        return this.getAnswer(question);
    }

    private String getAnswer(Question question) {
        String name = this.user.getInfo("name");
        String firstname = name != null
                ? name.split(" ")[0].substring(0, 1).toUpperCase()
                + name.split(" ")[0].substring(1)
                : null;
        System.out.print(name != null ? firstname + ": " : "User: ");
        String answer = scanner.nextLine();

        if (question.key.isEmpty()) return "";

        if (question.rel == QuestionRel.USER) {
            this.user.setInfo(question.key, answer);
        } else if (question.rel == QuestionRel.CAR) {
            this.car.setInfo(question.key, answer);
        }

        return answer;
    }

    private void displayInformation() {
        System.out.println("=========================================");
        System.out.println("Collected Information:");
        System.out.println("-----------------------------------------");

        int count = 0;
        while (questions.size() > count) {
            Question question = questions.get(count);

            count++;

            if (question.key.isEmpty()) continue;

            if (question.rel == QuestionRel.USER) {
                System.out.println(question.key.toUpperCase() + "\t: \t" + this.user.getInfo(question.key));
            } else if (question.rel == QuestionRel.CAR) {
                System.out.println(question.key.toUpperCase() + "\t: \t" + this.car.getInfo(question.key));
            }
        }

        System.out.println("=========================================");
    }
}
