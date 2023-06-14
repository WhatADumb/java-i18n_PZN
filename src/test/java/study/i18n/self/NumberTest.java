package study.i18n.self;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberTest {
    @Test
    void testNumberFormat() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        String result = numberFormat.format(1000000.123);
        System.out.println(result);
    }

    @Test
    void testNumberFormatIndonesia() {
        Locale indo = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(indo);

        String result = numberFormat.format(1000000.123);
        System.out.println(result);
    }

    @Test
    void testNumberFormatEnglish() {
        Locale eng = new Locale("en", "US");
        NumberFormat numberFormat = NumberFormat.getInstance(eng);

        String result = numberFormat.format(1000000.123);
        System.out.println(result);
    }

    @Test
    void testNumberFormatParseSuccessIndo() {
        Locale indo = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(indo);

        try{
            var numberParse = numberFormat.parse("10000000.321").longValue();
            System.out.println(numberParse);
        }catch (ParseException e){
            System.out.println("Error " + e.getMessage());
        }
    }

    @Test
    void testNumberFormatParseErrorIndo() {
        Locale indo = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(indo);

        try{
            var numberParse = numberFormat.parse("icikiwir").longValue();
            System.out.println(numberParse);
        }catch (ParseException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
