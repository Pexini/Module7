package Middle.Frog;

public class Player {


    public int getMovePlayer1() {
        return movePlayer1;
    }

    public void setMovePlayer1(int movePlayer1) {
        this.movePlayer1 = (int) (Math.random()*6);
    }

    private int movePlayer1;


}
