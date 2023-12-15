package chatbot.main;

import java.util.HashMap;

class Car extends HashMap<String, String> {
    public void setInfo(String key, String value) {
        this.put(key, value);
    }

    public String getInfo(String key) {
        return this.get(key);
    }
}
