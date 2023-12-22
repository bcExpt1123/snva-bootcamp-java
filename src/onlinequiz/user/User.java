package onlinequiz.user;

import java.util.HashMap;
import java.util.Map;

public class User implements IUser{
    Map<String, String> info = new HashMap<>();
    @Override
    public String getInfo(String key) {
        return info.get(key);
    }

    @Override
    public void setInfo(String key, String value) {
        info.put(key, value);
    }
}
