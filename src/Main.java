import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String severalWords;
        // 1: Вывести приглашение ввести имя.
        System.out.println("Введите ваше имя: ");

        // 2: Считать имя пользователя, введенное с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        // 3: Поздороваться с пользователем по введенному имени.
        System.out.println("Привет, " + userName + "!");



    }
}