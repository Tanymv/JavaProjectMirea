package practical7;

public interface Strable {
    int characterCount();
    String returnString();
    String invertingString();
}

class DoString implements Strable {
    String str;

    public DoString(String str) {
        this.str = str;
    }

    @Override
    public int characterCount() {
        return str.length();
    }

    @Override
    public String returnString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result.insert(0, str.charAt(i));
            }
        }
        result.reverse();
        return result.toString();
    }

    @Override
    public String invertingString() {
        char[] s = str.toCharArray(); char temp;
        for (int i = 0; i < (s.length/2); i++) {
            temp = s[s.length-1-i];
            s[s.length-1-i] = s[i];
            s[i] = temp;
        }
        return String.valueOf(s);
    }

    @Override
    public String toString() {
        return str;
    }
}

class TestStr {
    public static void main(String[] args) {
        Strable str = new DoString("Цикличность");
        System.out.println("Изначальное слово: " + str);
        System.out.println("Количество символов: " + str.characterCount());
        System.out.println("Возвращение строки: " + str.returnString());
        System.out.println("Инвертирование строки: " + str.invertingString());
    }
}
