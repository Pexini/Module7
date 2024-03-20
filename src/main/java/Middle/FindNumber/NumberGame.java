package Middle.FindNumber;

import java.util.Scanner;

public class NumberGame {
    private int secretNumber;
    private int maxAttempts;
    private int attempts;

    public NumberGame(int maxAttempts) {
        this.maxAttempts = maxAttempts;
        this.secretNumber = (int) (Math.random() * 10) + 1;
        this.attempts = maxAttempts;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру: Угадай число от 1 до 10");

        while (attempts > 0) {
            System.out.println("Введите ваше предположение: ");
            int number = scanner.nextInt();
            if (number == secretNumber) {
                System.out.println("Поздравляю вы угадали я загадал число " + secretNumber);
                return;
            } else if (number < secretNumber) {
                System.out.println("Извини, но мое число больше того что ты предположил, попробуй езе раз:");
            } else {
                System.out.println("Извини, но мое число меньше того что ты предположил, попробуй езе раз:");

            }
            attempts--;
            System.out.println("У вас осталось " + attempts + " попыток");

        }
        System.out.println("Извините, но вы проиграли. Загаданное число было " + secretNumber);
    }

}
