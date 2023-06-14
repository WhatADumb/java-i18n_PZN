package study.i18n.self;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChoiceTest {
    @Test
    void testChoiceFormat() {
        String pattern = "-1#nilai negatif | 0#kosong | 1#satu | 1<lebih";
        ChoiceFormat choiceFormat = new ChoiceFormat(pattern);
        System.out.println(choiceFormat.format(-3));
        System.out.println(choiceFormat.format(-1));
        System.out.println(choiceFormat.format(0));
        System.out.println(choiceFormat.format(1));
        System.out.println(choiceFormat.format(4));
    }

    @Test
    void testChoiceFormatWithMessageFormatIndo() {
        Locale locale = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
        String pattern = resourceBundle.getString("balance");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);

        System.out.println(messageFormat.format(new Object[]{"Fadhil", -1000000}));
        System.out.println(messageFormat.format(new Object[]{"Fadhil", 0}));
        System.out.println(messageFormat.format(new Object[]{"Fadhil", 1000000}));
    }

    @Test
    void testChoiceFormatWithMessageFormatUnitedK() {
        Locale locale = new Locale("en", "UK");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
        String pattern = resourceBundle.getString("balance");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);

        System.out.println(messageFormat.format(new Object[]{"Fadhil", -1000000}));
        System.out.println(messageFormat.format(new Object[]{"Fadhil", 0}));
        System.out.println(messageFormat.format(new Object[]{"Fadhil", 1000000}));
    }
}
