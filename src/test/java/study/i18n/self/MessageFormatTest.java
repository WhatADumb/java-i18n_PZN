package study.i18n.self;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {
    @Test
    void testMessageFormat() {
        String pattern = "Hallo {0}, semoga lekas sembuh {0}";
        MessageFormat messageFormat = new MessageFormat(pattern);
        String result = messageFormat.format(new Object[]{"Rasbu"});

        System.out.println(result);
    }

    @Test
    void testMessageFormatWithResourceBundleIndo() {
        Locale indo = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indo);

        String pattern = resourceBundle.getString("welcome.message");
        MessageFormat messageFormat = new MessageFormat(pattern);
        String result = messageFormat.format(new Object[]{"Fadhil", "NETFLIX"});

        System.out.println(result);
    }

    @Test
    void testMessageFormatWithResourceBundleUk() {
        Locale unitedK = new Locale("en", "UK");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", unitedK);

        String pattern = resourceBundle.getString("welcome.message");
        MessageFormat messageFormat = new MessageFormat(pattern);
        String result = messageFormat.format(new Object[]{"Fadhil", "NETFLIX"});

        System.out.println(result);
    }
}
