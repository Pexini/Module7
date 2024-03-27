package Hard.FourChoiseWithFigure;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Играем в игру “Камень-ножницы-бумага-колодец” : 0-камень, 1-ножницы, 2-бумага, 3 - колодец ");
        System.out.println("Введите значение от 0 до 3 ");

        Figure [] figures = new Figure[]{new Rock(), new Scissers(), new Paper(), new Well()};
        int userChoice = sc.nextInt();

        if (userChoice < 0 || userChoice > 3) {
            System.out.println("Некорректный ввод. Пожалуйста введите число от 0 до 2");
            return;
        }
        int computerChoice = (int) (Math.random() * 3);
        Figure userFigure = figures[userChoice];
        Figure computerFigure = figures[computerChoice];

        if (userFigure.isWon(computerFigure)) {
            System.out.println("Поздравляю вы победили, " + " выбор компьтера " + computerChoice);
        } else if (computerFigure.isWon(userFigure)) {
            System.out.println("Извините, вы проиграли, " + " выбор компьтера " +computerChoice);
        }else {
            System.out.println("Ничья, " + " выбор компьтера " + + computerChoice);
        }

    }
}
