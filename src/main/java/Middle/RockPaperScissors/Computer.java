package Middle.RockPaperScissors;

public class Computer {

    private int choice;

    public void generateChoise() {
        choice = (int) (Math.random()*3);
    }

    public int getChoice() {
        return choice;
    }

}
