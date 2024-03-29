package Hard.FourChoise;

import java.util.Scanner;

public class Game {
    private Player player;
    private Computer computer;
    private int counter;
    private int playerWins;
    private int competerWins;


    public Game(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
        this.counter = 0;
        this.playerWins = 0;
        this.competerWins = 0;
    }

    public void startGame(Scanner scanner) {
        while (playerWins < 3 && competerWins < 3) {
            int userChoice;
            do {
                System.out.println("Играем в игру “Камень-ножницы-бумага-колодец” : 0-камень, 1-ножницы, 2-бумага, 3 - колодец ");
                System.out.println("Введите значение от 0 до 3 ");
                userChoice = scanner.nextInt();
                if (userChoice < 0 || userChoice > 3) {
                    System.out.println("Неккоректный ввод. Пожалуйста введите число от 0 до 2");
                }
            } while (userChoice < 0 || userChoice > 3);


            player.setChoise(userChoice);
            computer.generateChoice();

            int result = calculateResult();
            displayResult(result);
        }
        if (playerWins == 3) {
            System.out.println("Игрок Победил");

        } else {
            System.out.println("Компьютер победил");
        }
    }


    private int calculateResult() {
        int userChoice = player.getChoice();
        int computerChoice = computer.getChoice();
        if (userChoice == computerChoice) {
            return 0;
        } else if ((userChoice == 0 && computerChoice == 1) ||
                (userChoice == 1 && computerChoice == 2) ||
                (userChoice == 2 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 3) ||
                (userChoice == 3 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 0)) {
            playerWins++;
            return 1;
        } else {
            competerWins++;
            return -1;
        }
    }

    private void displayResult(int result) {
        if (result == 0) {
            System.out.println("Ничья " );
        } else if (result == 1) {
            System.out.println("Поздравляю вы выйграли " + "вы выйграли: " + playerWins + " раз");
        } else {
            System.out.println("Извините вы проиграли " + "компьютер выйграл " + competerWins + " раз");
        }
        System.out.println("Выбор компьютера " + computer.getChoice());
    }
}

