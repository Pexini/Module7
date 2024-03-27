package Hard.FourChoiseWithFigure;

public class Rock implements Figure{
    @Override
   public int getType(){
        return 0;
    }
    @Override
    public boolean isWon(Figure opponent){
        return opponent instanceof Scissers;
    }

}
