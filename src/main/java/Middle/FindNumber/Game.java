package Middle.FindNumber;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим игры:");
        System.out.println("1. Без ограничения количества попыток");
        System.out.println("2. Ограниченное количество попыток");
        int mode = scanner.nextInt();

        if (mode == 1) {
            NumberGame game = new NumberGame(Integer.MAX_VALUE);
            game.play();
        } else if (mode == 2) {
            System.out.println("Введите количество попыток:");
            int maxAttempts = scanner.nextInt();
            NumberGame game = new NumberGame(maxAttempts);
            game.play();
        } else {
            System.out.println("Некорректный режим игры.");
        }
    }
}
