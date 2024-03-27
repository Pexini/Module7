package Middle.RockScissersPaperWithFigure;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Играем в игру “Камень-ножницы-бумага” : 0-камень, 1-ножницы, 2-бумага ");
        System.out.println("Выбери значение от 0 до 2 ");
        Figure[] figures = new Figure[]{new Rock(), new Scissors(), new Paper()};
        int userChoice = scanner.nextInt();

        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Некорректный ввод. Пожалуйста введите число от 0 до 2");
            return;
        }
        int computerChoice = (int) (Math.random() * 2);
        Figure userfigure = figures[userChoice];
        Figure computerFigure = figures[computerChoice];

        if (userfigure.isWon(computerFigure)) {
            System.out.println("Поздравляю вы победили" + " Выбор компьютера " + computerChoice);
        } else if (computerFigure.isWon(userfigure)) {
            System.out.println("Извините вы проиграли" + " Выбор компьютера " + computerChoice);
        } else {
            System.out.println("Ничья " + " Выбор компьютера " + computerChoice);
        }
    }

}
