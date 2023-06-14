package study.i18n.self;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {
    @Test
    void testMessageFormatDefault() {
        Locale locale = new Locale("id", "ID");

        String pattern = "Hello {0}, At {1} your balance is {2}.";
        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String result = messageFormat.format(new Object[]{"Fadhil", new Date(), 500000});

        System.out.println(result);
    }

    @Test
    void testMessageFormatWithType() {
        Locale locale = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("status.message");
        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String result = messageFormat.format(new Object[]{"Fadhil", new Date(), 500000});

        System.out.println(result);
    }
}
