package Middle.Frog;

public class Player {

private Frog frog;

    private int lastRoll;

public  Player (Frog frog){
    this.frog = frog;

}
public void throwDice(){
    int roll = (int) (Math.random()*6)+1;
    frog.jump(roll);
}
    public int getLastRoll() {
        return lastRoll;
    }


}
