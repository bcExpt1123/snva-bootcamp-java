package chatbot.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public boolean isValid(String str, String patternStr) {
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}
