package chatbot.main.car;

import java.util.HashMap;

public class Car extends HashMap<String, String> {

    public HashMap<String, CarModel> models = new HashMap<>();
    public HashMap<String, PaymentOption> lease = new HashMap<>();
    public HashMap<String, PaymentOption> finance = new HashMap<>();
    public void setInfo(String key, String value) {
        this.put(key, value);
    }

    public String getInfo(String key) {
        return this.get(key);
    }

    public void addModel(String modelId, String description){
        models.put(modelId, new CarModel(modelId, description));
    }

    public boolean isValidModel(String modelId) {
        return models.get(modelId) != null;
    }

}
