package Middle.Frog;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Frog frog1 = new Frog();
        Frog frog2 = new Frog();

        Player player1 = new Player(frog1);
        Player player2 = new Player(frog2);



        while (true){
            System.out.println("");
        }
    }
}