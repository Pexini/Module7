package Middle.Frog;

import java.util.Scanner;

public class Game {
    private static final int WINNER_MAX_JUMP = 30;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Frog frog1 = new Frog();
        Frog frog2 = new Frog();

        Player player1 = new Player(frog1);
        Player player2 = new Player(frog2);

        System.out.println("Добро пожаловать в игру Лягушки. Каждый из вас должен по очереди бросать кубик и тот чья лягушка первой сделает 30 прыжков - Победил");
        System.out.println("Начинает игру Игрок под номером 1 - кидайте кубик.");
        while (true) {
            System.out.println();
            System.out.println("Игрок номер 1. Нажмите Enter - что бы бросить кубик");
            scanner.nextLine();
            player1.throwDice();
            System.out.println( "На кости выпало число " + player1.getLastRoll());
            System.out.println();


            System.out.println("Ход игрока под номером 2. Нажмите Enter - что бы бросить кубик");
            scanner.nextLine();
            player2.throwDice();
            System.out.println( "На кости выпало число " +player2.getLastRoll());
            System.out.println();

            System.out.println("Текущее состояние: ");
            System.out.println("Игрок 1 " + frog1);
            System.out.println("Игрок 2 " + frog2);

            if (frog1.getJumpCount() >= WINNER_MAX_JUMP) {
                System.out.println("Поздравляю Игрок 1 победил. " +  frog1);
                break;
            } else if (frog2.getJumpCount() >= WINNER_MAX_JUMP) {
                System.out.println("Поздравляю Игрок 2 победил. " +  frog2);
                break;
            }
        }
        scanner.close();
    }
}