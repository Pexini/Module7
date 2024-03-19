package Middle.TaskThimble;

public class Thimble {
    public int showNumber() {
        int number = (int) (Math.random() * 3) + 1;
        return number;
    }

    public String visionThimble() {
        String thimbleVision = "________   ________   _______\n" +
                               "|      |   |      |   |      |\n" +
                               "|  1   |   |  2   |   |  3   |\n" +
                               "|______|   |______|   |______|\n";
   return thimbleVision;
    }
}
