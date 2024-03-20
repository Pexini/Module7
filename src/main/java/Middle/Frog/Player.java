package Middle.Frog;

public class Player {

private Frog frog;
public  Player (Frog frog){
    this.frog = frog;

}
public void throwDice(){
    int roll = (int) (Math.random()*6)+1;
    frog.jump(roll);
}

}
