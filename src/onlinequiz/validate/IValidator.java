package onlinequiz.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface IValidator {
    static boolean isValid(String str, String patternStr) {
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(str);
            return matcher.matches();
    }
}
