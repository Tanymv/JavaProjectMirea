package practical14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Third {
    public static void main(String[] args) {
        String str_ = "Цены: 25.98 USD, 44 RUB, 4 EU.";

        Pattern pattern = Pattern.compile("(\\d+(\\.\\d+)?) (USD|RUB|EU)");
        Matcher matcher = pattern.matcher(str_);

        while (matcher.find()) {
            double price = Double.parseDouble(matcher.group(1));
            String currency = matcher.group(3);

            System.out.println("Цена: " + price + " " + currency);
        }
    }
}
