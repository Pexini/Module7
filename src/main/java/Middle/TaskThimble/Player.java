package Middle.TaskThimble;

public class Player {
    private int winCounter = 1;
    Thimble thimble = new Thimble();

    public void increaseWinCounter() {

        System.out.println("Вы угадали" + " Шарик был спрятан в наперстке # " + thimble.showNumber() + " получите балл! " + winCounter);

    }

    public int getWinCounter() {
        winCounter++;
        return winCounter;
    }
}
