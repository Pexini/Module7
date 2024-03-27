package Middle.RockScissersPaperWithFigure;

public class Paper implements Figure{
    @Override
    public int getType(){
        return 2;
    }
    @Override
    public boolean isWon(Figure opponent) {
        return opponent instanceof Rock;
    }
}
