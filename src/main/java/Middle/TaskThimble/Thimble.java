package Middle.TaskThimble;

public class Thimble {
    public int showNumber(){
        int number = (int) (Math.random()*3);
        System.out.println(number);
        return number;
    }
}
