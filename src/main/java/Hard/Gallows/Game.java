package Hard.Gallows;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player("Ведущий");
        Player player2 = new Player("Игрок");

        System.out.println("Итак Ведущий, загадайте слово : ");

        String wordToGuess = scanner.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();  // это я дома играл с детьми, и что бы в консоле не было видно слово, добавил пробелов.
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Добрый день игрок - сегодня вам предстоит отгадать загаданное слово используя максимум 6 попыток.");
        HangmanGame hangmanGame = new HangmanGame(wordToGuess, player1, player2);
        DrawHangman drawHangman = new DrawHangman();
        while (!hangmanGame.isGameOver()) {

            System.out.println("Загаданное слово " + hangmanGame.getGuessedWord());
            System.out.println("Введите букву: ");
            System.out.println();
            char gues = scanner.nextLine().toLowerCase().charAt(0);
            boolean found = hangmanGame.guessLetter(gues);
            if (!found) {
                System.out.println(" Ошибка ");
                System.out.println();
                drawHangman.drawNextPart(hangmanGame.getErrors());
                System.out.println();

            }
        }
        if (hangmanGame.getErrors() >= 6) {
            System.out.println(player2.getName() + " Проиграл, загаданное слово: " + wordToGuess);
        } else {
            System.out.println("Поздравляю " + player2.getName() + "Вы, выйграли");
        }
        scanner.close();
    }
}
