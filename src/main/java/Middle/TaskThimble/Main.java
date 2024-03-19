package Middle.TaskThimble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thimble thimble = new Thimble();
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        while (!player.hasWon()) {
            System.out.println("Перед вами три наперстка, в одном из них спрятан шарик");
            System.out.println(thimble.visionThimble());
            System.out.println("Введите номер наперстка, от 1 до 3 в котором как вы думаете спрятан шарик: ");
            int answer = scanner.nextInt();
            if (answer < 1 || answer > 3) {
                System.out.println("Пожалуйста введите число от 1 до 3.");
                continue;
            }
            int realNumber = thimble.showNumber();
            if (answer == realNumber) {
                player.increaseWinCounter();
                System.out.println("Шарик был спрятан в наперске # " + realNumber);
                System.out.println("У вас баллов  " + player.getWinCounter());
                System.out.println();
            } else {
                System.out.println("Извините, вы не угадали" + " Шарик был спрятан в наперстке № " + " " + realNumber);
                System.out.println();
            }
        }

        System.out.println("Поздравляем вы выйграли " + player.getWinCounter());
    }
}

