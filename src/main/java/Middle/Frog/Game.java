package Middle.Frog;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Frog frog1 = new Frog();
        Frog frog2 = new Frog();

        Player player1 = new Player(frog1);
        Player player2 = new Player(frog2);

        System.out.println("Добро пожаловать в игру Лягушки. Каждый из вас должен по очереди бросать кубик и тот чья лягушка первой сделает 30 прыжков - Победил");
        System.out.println("Начинает игру Игрок под номером 1 - кидайте кубик.");
        while (true) {
            System.out.println("Нажмите Enter - что бы бросить кубик");
            scanner.nextLine();
            player1.throwDice();
            System.out.println(frog1);
            System.out.println();


            System.out.println("Ход игрока под номером 2. Нажмите Enter - что бы бросить кубик");
            scanner.nextLine();
            player2.throwDice();
            System.out.println(frog2);
            System.out.println();

            System.out.println("Текущее состояние: ");
            System.out.println("Игрок 1 " + frog1);
            System.out.println("Игрок 2 " + frog2);

            if (frog1.getJumpCount() >= 30) {
                System.out.println("Поздравляю Игрок 1 побудил. " + " Его лягушка первая сделала " + frog1);
                break;
            } else if (frog2.getJumpCount() >= 30) {
                System.out.println("Поздравляю Игрок 2 побудил. " + " Его лягушка первая сделала " + frog2);
                break;
            }
        }
        scanner.close();
    }
}