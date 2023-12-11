package practical25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceExtractionApp {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 ERR, 10 RUВ, 0.004 EU";

        Pattern pattern = Pattern.compile("\\b\\d+(\\.\\d{1,2})? (USD|RUВ|EU)\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Извлеченные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
