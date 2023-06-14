package study.i18n.self;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {
    @Test
    void testCurrencyUsa() {
        Locale defaultLocale = new Locale("en", "US");
        Currency currency = Currency.getInstance(defaultLocale);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(defaultLocale));
    }

    @Test
    void testCurrencyIndo() {
        Locale defaultLocale = new Locale("id", "ID");
        Currency currency = Currency.getInstance(defaultLocale);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(defaultLocale));
    }

    @Test
    void testNumberFormatCurrencyIndo() {
        Locale indo = new Locale("id", "ID");
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(indo);

        System.out.println(rupiah.format(213425342576.64211));
    }

    @Test
    void testNumberFormatParseCurrencyIndo() {
        Locale indo = new Locale("id", "ID");
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(indo);

        try {
            var parseRupiah = rupiah.parse("Rp350.000,00").doubleValue();
            System.out.println(parseRupiah);
        } catch (ParseException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
