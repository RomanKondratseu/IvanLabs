package lab.task.one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestLabOneTaskOne {

    @Test
    public void shouldBeExclamationMarksInRange() {
        String actual = LabOneTaskOne.generateGreeting();
        Pattern pattern = Pattern.compile("^!{5,50}$",8);
        Matcher matcher = pattern.matcher(actual);
        Assertions.assertTrue(matcher.find());
    }
}
