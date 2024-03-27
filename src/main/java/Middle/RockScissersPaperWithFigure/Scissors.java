package Middle.RockScissersPaperWithFigure;

public class Scissors implements Figure{
    @Override
    public int getType(){
        return 1;
    }
    @Override
    public boolean isWon(Figure opponent) {
        return opponent instanceof Paper;
    }
}
