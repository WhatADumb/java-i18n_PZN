package study.i18n.self;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {
    @Test
    void testlocaleIndo() {
        String lang = "id"; //ISO 639
        String country = "ID"; //ISO 3166

        Locale localeIndo = new Locale(lang, country);

        System.out.println(localeIndo.getLanguage());
        System.out.println(localeIndo.getCountry());

        System.out.println(localeIndo.getDisplayLanguage());
        System.out.println(localeIndo.getDisplayCountry());
    }

    @Test
    void testLocaleJapanese() {
        String lang = "ja";
        String country = "JP";

        Locale localeJapan = new Locale(lang, country);

        System.out.println(localeJapan.getLanguage());
        System.out.println(localeJapan.getCountry());

        System.out.println(localeJapan.getDisplayLanguage());
        System.out.println(localeJapan.getDisplayCountry());
    }
}
