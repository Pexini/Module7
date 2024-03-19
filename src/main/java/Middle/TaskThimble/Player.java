package Middle.TaskThimble;

public class Player {
    private int winCounter = 0;
    Thimble thimble = new Thimble();


    public void increaseWinCounter() {
        winCounter++;
        System.out.println("Вы угадали, " + " получите балл! ");

    }

    public int getWinCounter() {
        return winCounter;
    }
    public boolean hasWon(){
        return  winCounter >=3;
    }
}
