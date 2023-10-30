package practical13;
import java.util.*;
class FifthFormat {
    String phone;

    public FifthFormat(String phone) {
        this.phone = phone;
    }

    public String getFormat() {
        if (!phone.isEmpty()) {
            String TenNumber = phone.substring(phone.length()-10);
            String code;
            if (phone.charAt(0) == '+') {
                code = phone.substring(1, phone.length()-10);
            } else if (phone.charAt(0) == '8') {
                code = "7";
            } else {
                return "Неизвестный код страны.";
            }
            String FirstThreeNumbers = TenNumber.substring(0,3);
            String SecondThreeNumbers = TenNumber.substring(3,6);
            String FourNumbers = TenNumber.substring(6, 10);
            return String.format("+%s %s-%s-%s",
                    code, FirstThreeNumbers, SecondThreeNumbers, FourNumbers);
        } else {
            return "Вы не ввели номер телефона";
        }
    }
}

class fifth {
    public static void main(String[] args) {
        System.out.print("Введите номер телефона: ");
        Scanner src = new Scanner(System.in);
        FifthFormat phone = new FifthFormat(src.next());
        System.out.println("Отформатированный номер: " + phone.getFormat());
    }
}