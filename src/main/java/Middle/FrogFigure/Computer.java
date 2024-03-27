package Middle.FrogFigure;

public class Computer {
    private int choice;

    public void generateChoice() {
        choice = (int) (Math.random()*2);
    }

    public int getChoice() {
        return choice;
    }
}
