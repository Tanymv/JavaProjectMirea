package practical14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public static boolean matchesPattern(String input, String pattern) {
    Pattern regex = Pattern.compile(pattern);
    Matcher matcher = regex.matcher(input);

    return matcher.matches();
}
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuv18340";
        String str_1 = "abcdefghijklmnopqrstuv18340";
        String str_2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        boolean isMatched1 = matchesPattern(input, str_1);

        if (isMatched1) {
            System.out.println("Строка 1 соответствует шаблону.");
        } else {
            System.out.println("Строка 1 не соответствует шаблону.");
        }

        boolean isMatched2 = matchesPattern(input, str_2);

        if (isMatched2) {
            System.out.println("Строка 2 соответствует шаблону.");
        } else {
            System.out.println("Строка 2 не соответствует шаблону.");
        }
    }
}
