package Middle.RockPaperScissors;

import java.util.Scanner;

public class RockPaperScissorsStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Computer computer = new Computer();
        Game game = new Game(player, computer);
        game.startGame(scanner);

    }
}
