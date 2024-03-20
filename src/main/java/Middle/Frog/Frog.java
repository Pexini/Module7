package Middle.Frog;

public class Frog {



    private int jumpCount;
   public void jump(int count){
       jumpCount += count;

   }
    public int getJumpCount() {
        return jumpCount;
    }
    @Override
    public String toString(){
       return "Лягушка сдклала " + jumpCount + " прыжков";
    }

}
