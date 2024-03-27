package Hard.FourChoiseWithFigure;

public class Scissers implements Figure {
    @Override
    public int getType(){
        return 1;
    }
    @Override
    public boolean isWon(Figure opponent){
        return opponent instanceof Paper;
    }
}
