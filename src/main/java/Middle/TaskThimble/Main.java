package Middle.TaskThimble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thimble thimble = new Thimble();
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.println("Перед вами три наперстка, в одном из них спрятан шарик");
        System.out.println("Введите номер наперстка, от 1 до 3 в котором как вы думаете спрятан шарик: ");
        int answer = scanner.nextInt();
        int realNumber = thimble.showNumber();
        if (answer == realNumber) {
            player.increaseWinCounter();
            System.out.println("У вас баллов  " + player.getWinCounter());
        } else {
            System.out.println("Извините, вы не угадали" + " Шарик был спрятан в наперстке № " + " " + thimble.showNumber());
        }

    }
}