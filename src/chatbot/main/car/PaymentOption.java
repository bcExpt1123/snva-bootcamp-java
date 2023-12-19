package chatbot.main.car;

public class PaymentOption {
    public String key;
    public String description;

    public PaymentOption(String key, String description) {
        this.key = key;
        this.description = description;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
