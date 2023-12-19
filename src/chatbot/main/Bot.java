package chatbot.main;

import chatbot.main.car.Car;
import chatbot.main.car.PaymentOption;
import chatbot.main.question.Question;
import chatbot.main.question.QuestionRel;

import java.util.ArrayList;
import java.util.Scanner;

public class Bot {
    private final Scanner scanner;
    private final User user;
    private final Car car;
    private final ArrayList<Question> questions;

    private boolean addedPaymentQuestion = false;

    public Bot() {
        this.scanner = new Scanner(System.in);
        this.user = new User();

        // Initialize car & add available models.
        this.car = new Car();
        this.car.addModel("X3", "BMW X3: 60,000 MSRP");
        this.car.addModel("X5", "BMW X5: 70,000 MSRP");
        this.car.addModel("X7", "BMW X7: 80,000 MSRP");
        this.car.lease.put("A", new PaymentOption("A", "for 3 years: 2000 per month"));
        this.car.lease.put("B", new PaymentOption("B", "for 2 years: 3000 per month"));
        this.car.lease.put("C", new PaymentOption("C", "for 1 years: 6000 per month"));
        this.car.finance.put("A", new PaymentOption("A", "for 3 years: 1500 per month"));
        this.car.finance.put("B", new PaymentOption("B", "for 4 years: 1200 per month"));
        this.car.finance.put("C", new PaymentOption("C", "for 5 years: 1000 per month"));

        this.questions = new ArrayList<Question>();
        Question nameQuestion = new Question("Hi, Welcome! My name is Jenny. Can I ask your name?", QuestionRel.USER, "name");
        nameQuestion.setPattern(Validator.namePattern);
        this.questions.add(nameQuestion);
    }

    public void storeQuestions(String name) {
        this.questions.add(new Question("Hey " + name + ", How are you?", QuestionRel.USER, ""));
        this.questions.add(new Question("That sounds good, how may I help you?", QuestionRel.USER, ""));

        Question stateQuestion = new Question("Sure, May I ask which state are you reside in?", QuestionRel.USER, "state");
        stateQuestion.setPattern(Validator.statePattern);
        this.questions.add(stateQuestion);

        this.questions.add(new Question("In which city are you currently located?", QuestionRel.USER, "city"));
        this.questions.add(new Question("What is the model of your car?\n - BMW X3: 60,000 MSRP\n - BMW X5: 70,000 MSRP\n - BMW X7: 80,000 MSRP\n Please choose one of X3, X5, X7.", QuestionRel.CAR, "model"));

        Question taxQuestion = new Question("What are the taxes on your car?", QuestionRel.CAR, "taxes");
        taxQuestion.setPattern(Validator.numberPattern);
        this.questions.add(taxQuestion);

        Question paymentQuestion = new Question("Please choose the payment option. \n - Lease \n - Cash \n - Finance", QuestionRel.CAR, "payment");
        paymentQuestion.setPattern("(Lease|Cash|Finance)");
        this.questions.add(paymentQuestion);
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

        String validAnswer = validateAnswer(question, answer);

        if(question.key.equals("payment") && !addedPaymentQuestion) {
            System.out.println("add payment");
            addedPaymentQuestion = true;
            addPaymentQuestion(validAnswer);
        }

        if (question.key.isEmpty()) return "";

        if (question.rel == QuestionRel.USER) {
            this.user.setInfo(question.key, validAnswer);
        } else if (question.rel == QuestionRel.CAR) {
            this.car.setInfo(question.key, validAnswer);
        }

        return validAnswer;
    }

    void addPaymentQuestion(String payment) {
        Question paymentQuestion = new Question("", QuestionRel.CAR, "");
        switch (payment) {
            case "Lease":
                paymentQuestion.setMessage("Lease: Down Payment 10,000. Please choose one option(A, B, C).\n A) for 3 years: 2000 per month\n B) for 2 years: 3000 per month\n C) for 1 years: 6000 per month");
                paymentQuestion.setKey("Lease");
                paymentQuestion.setPattern("[ABC]");
                break;
            case "Cash":
                paymentQuestion.setMessage("Please enter cash amount");
                paymentQuestion.setKey("Cash");
                paymentQuestion.setPattern(Validator.numberPattern);
                break;
            case "Finance":
                paymentQuestion.setMessage("Finance: Down Payment 10,000. Please choose one option(A, B, C).\n A) for 3 years: 1500 per month\n B) for 4 years: 1200 per month\n C) for 5 years: 1000 per month");
                paymentQuestion.setKey("Finance");
                paymentQuestion.setPattern("[ABC]");
                break;
        }
        this.questions.add(paymentQuestion);
    }

    private String validateAnswer(Question question, String answer) {
        boolean isValid = true;
        switch (question.key) {
            case "model":
                isValid = this.car.isValidModel(answer);
                break;
            default:
                isValid = question.isValid(answer);
                break;
        }
        if(!isValid) {
            System.out.println("Please answer correctly!");
            return ask(question);
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
                if(question.key.equals("model")) {
                    System.out.println(question.key.toUpperCase() + "\t: \t" + this.car.models.get(this.car.getInfo(question.key)).modelDescription);
                }else if(question.key.equals("Lease")){
                    System.out.println(question.key.toUpperCase() + "\t: \t" + this.car.lease.get(this.car.getInfo(question.key)).description);
                }else if(question.key.equals("Finance")){
                    System.out.println(question.key.toUpperCase() + "\t: \t" + this.car.finance.get(this.car.getInfo(question.key)).description);
                } else {
                    System.out.println(question.key.toUpperCase() + "\t: \t" + this.car.getInfo(question.key));
                }
            }
        }

        System.out.println("=========================================");
    }
}
