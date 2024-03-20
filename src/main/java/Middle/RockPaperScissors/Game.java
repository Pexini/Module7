package Middle.RockPaperScissors;

import java.util.Scanner;

public class Game {
    private Player player;
    private Computer computer;

    public Game(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public void startGame(Scanner scanner) {
        int userChoice;
        do {
            System.out.println("Играем в игру “Камень-ножницы-бумага” : 0-камень, 1-ножницы, 2-бумага ");
            System.out.println("Введите значение от 0 до 2 ");
            userChoice = scanner.nextInt();
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Неккоректный ввод. Пожалуйста введите число от 0 до 2");
            }
        } while (userChoice < 0 || userChoice > 2);


        player.setChoice(userChoice);
        computer.generateChoice();

        int result = calculateResult();
        displayResult(result);
    }

    private int calculateResult() {
        int userChoice = player.getChoice();
        int computerChoice = computer.getChoice();

        if (userChoice == computerChoice) {
            return 0;
        } else if ((userChoice == 0 && computerChoice == 1) ||
                (userChoice == 1 && computerChoice == 2) ||
                (userChoice == 2 && computerChoice == 0)) {
            return 1;
        } else {
            return -1;
        }

    }

    private void displayResult(int result) {
        if (result == 0) {
            System.out.println("Ничья");
        } else if (result == 1) {
            System.out.println("Поздравляю ты выйграл");
        } else {
            System.out.println("Извини, ты проиграл");
        }
        System.out.println("Выбор компьютера " + computer.getChoice());
    }
}
