package Middle.Frog;

import java.util.Scanner;

public class Dice {
    private int minDice = 1;
    private int maxDice = 6;
    public int jumpCount;

    private Player player1;
    private Frog player2;

    public Dice(Player player1, Frog player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame(Scanner scanner) {
        int user1Choice;
        do {
            System.out.println("Добро пожаловать в игру Лягушки. Каждый из вас должен по очереди бросать кубик и тот чья лягушка сделает 30 прыжков - Победил");
            System.out.println("Начинает игру Игрок под номером 1 - кидайте кубик.");
            System.out.println("Что бы бросить кубик - введите цифру 1");
            user1Choice = scanner.nextInt();
            if (user1Choice != 1) {
                System.out.println("Что бы бросить кубик - введите цифру 1");
            }
        } while (user1Choice == 1);
        int player1Move = player1.getMovePlayer1();



    }
}
