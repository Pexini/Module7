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
        System.out.println("Играем в игру “Камень-ножницы-бумага” : 0-камень, 1-ножницы, 2-бумага ");
        System.out.println("Выбери значение от 0 до 2 ");
        int userChoice = scanner.nextInt();
        player.setChoise(userChoice);
        computer.generateChoise();

        int result = calculateResult();
    }

    private int calculateResult() {
        int userChoice = player.getChoise();
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
            System.out.println("Ничья, я тоже загадал ");
        } else if (result == 1) {
            System.out.println("Поздравляю ты выйграл, компьютер загадал ");
        } else {
            System.out.println("Извини, ты проиграл, компьютер занадал ");
        }
        System.out.println("Выбор компьютера " + computer.getChoice());
    }
}
