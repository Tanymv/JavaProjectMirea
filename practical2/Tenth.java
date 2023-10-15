package practical2;
import java.util.Scanner;
public class Tenth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел ");
        String input = sc.nextLine();
        int count = 0;
        if(!input.isEmpty()){
            count++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        }

        System.out.println("Вы ввели " +count+ " слов");
    }
}
