package Hard.Gallows;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player("Ведущий");
        Player player2 = new Player("Игрок");

        System.out.println("Игрок 1, Загадайте слово : ");

        String wordToGuess = scanner.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        HangmanGame hangmanGame = new HangmanGame(wordToGuess, player1, player2);
        DrawHangman drawHangman = new DrawHangman();
        while (!hangmanGame.isGameOver()) {

            System.out.println("Загаданное слово " + hangmanGame.getGuessedWord());
            System.out.println("Правильно, введите следующую букву: ");
            char gues = scanner.nextLine().toLowerCase().charAt(0);
            boolean found = hangmanGame.guessLetter(gues);
            if (!found) {
                System.out.println(" Ошибка ");
                System.out.println();
                drawHangman.drawNextPart(hangmanGame.getErrors());
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
