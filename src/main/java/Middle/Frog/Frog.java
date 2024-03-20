package Middle.Frog;

public class Frog {


    private int jumpCount;

    public void jump(int count) {
        jumpCount += count;

    }

    public int getJumpCount() {
        return jumpCount;
    }

    @Override
    public String toString() {
        String ending;
        if (jumpCount % 10 == 1 && jumpCount != 11) {
            ending = "прыжок";
        } else if ((jumpCount % 10 == 2 || jumpCount % 10 == 3 || jumpCount % 10 == 4) && (jumpCount != 12 && jumpCount != 13 && jumpCount != 14)) {
            ending = "прыжка";
        } else {
            ending = "прыжков";
        }
        return "Лягушка сделала " + jumpCount + " " + ending;
    }

}
