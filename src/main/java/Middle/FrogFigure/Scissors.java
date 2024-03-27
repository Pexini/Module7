package Middle.FrogFigure;

public class Scissors implements Figure{
    @Override
    public int getType() {
        return 0;
    }

    @Override
    public boolean isWon(Figure opponent) {
        return opponent instanceof Paper;
    }
}
