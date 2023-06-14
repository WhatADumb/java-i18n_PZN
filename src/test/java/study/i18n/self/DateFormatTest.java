package study.i18n.self;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    @Test
    void testDateFormat() {
        String pattern = "EEEE / dd-MMMM-yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        System.out.println(dateFormat.format(new Date()));
    }

    @Test
    void testDateFormatIndonesia() {
        String pattern = "EEEE / dd-MMMM-yyyy";
        Locale indo = new Locale("id", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, indo);

        System.out.println(dateFormat.format(new Date()));
    }

    @Test
    void testDateFormatJapan() {
        String pattern = "EEEE / dd-MMMM-yyyy";
        Locale japan = new Locale("ja", "JP");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, japan);

        System.out.println(dateFormat.format(new Date()));
    }

    @Test
    void testDateFormatParseIndoSuccess() {
        String pattern = "EEEE / dd-MMMM-yyyy";
        Locale indo = new Locale("id", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, indo);

        try {
            Date dateIndo = dateFormat.parse("Minggu / 03-Oktober-2021");
            System.out.println(dateIndo);
        } catch (ParseException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Test
    void testDateFormatParseJapanSuccess() {
        String pattern = "EEEE / dd-MMMM-yyyy";
        Locale japan = new Locale("ja", "JP");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, japan);

        try {
            Date dateJapan = dateFormat.parse("火曜日 / 09-5月-2023");
            System.out.println(dateJapan);
        } catch (ParseException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Test
    void testDateFormatParseIndoFailed() {
        String pattern = "EEEE / dd-MMMM-yyyy";
        Locale indo = new Locale("id", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, indo);

        try {
            Date dateIndo = dateFormat.parse("Apaantuh / 03-Oktober-2021");
            System.out.println(dateIndo);
        } catch (ParseException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
