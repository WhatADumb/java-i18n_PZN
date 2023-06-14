package study.i18n.self;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    @Test
    void testResourceBundle() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle.getString("greeting"));
        System.out.println(resourceBundle.getString("bye"));
    }

    @Test
    void testResourceBundleLocaleIndonesia() {
        String lang = "id";
        String country = "ID";
        Locale indonesia = new Locale(lang, country);
        ResourceBundle resourceBundleIndo = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundleIndo.getString("greeting"));
        System.out.println(resourceBundleIndo.getString("bye"));
    }

    @Test
    void testResourceBundleLocaleUnitedKingdom() {
        String lang = "en";
        String country = "UK";
        Locale uk = new Locale(lang, country);
        ResourceBundle resourceBundleUk = ResourceBundle.getBundle("message", uk);

        System.out.println(resourceBundleUk.getString("greeting"));
        System.out.println(resourceBundleUk.getString("bye"));
    }

    @Test
    void testResourceBundleLocaleDefault() {
        String lang = "xx";
        String country = "XX";
        Locale fallback = new Locale(lang, country);
        ResourceBundle resourceBundlefallback = ResourceBundle.getBundle("message", fallback);

        System.out.println(resourceBundlefallback.getString("greeting"));
        System.out.println(resourceBundlefallback.getString("bye"));
    }

    @Test
    void testResourceBundleSameObj() {
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("message");
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle1 == resourceBundle2);
    }
}
