package main.java.by.rublevskaya.model.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.java.by.rublevskaya.model.util.Constants.URL;

public class URLValidator {
    public static boolean isValidUrl(String inputLink) {
        Pattern pattern = Pattern.compile(URL);
        Matcher matcher = pattern.matcher(inputLink);
        return matcher.matches();
    }
}
