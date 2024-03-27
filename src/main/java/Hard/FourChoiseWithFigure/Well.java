package Hard.FourChoiseWithFigure;

public class Well implements Figure{
    @Override
    public int getType(){
        return 3;
    }
    @Override
    public boolean isWon(Figure opponent){
        return opponent instanceof Scissers || opponent instanceof Rock;
    }
}
