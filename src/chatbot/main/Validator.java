package chatbot.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static String namePattern = "[A-Za-z]+";

    public static String numberPattern = "\\d+";
    public static String statePattern = "^(AL|AK|AR|AZ|CA|CO|CT|DC|DE|FL|GA|HI|IA|ID|IL|IN|KS|KY|LA|MA|MD|ME|MI|MN|MO|MS|MT|NC|ND|NE|NH|NJ|NM|NV|NY|OH|OK|OR|PA|RI|SC|SD|TN|TX|UT|VA|VT|WA|WI|WV|WY)$";

    public static boolean isValid(String str, String patternStr) {
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
