package Hard.Gallows;

public class DrawHangman {
    public void drawNextPart(int errors) {
        switch (errors) {
            case 1:
                System.out.println("  |-----*");
                break;
            case 2:
                System.out.println("  |-----*");
                System.out.println("  |     |");
                break;
            case 3:
                System.out.println("  |-----*");
                System.out.println("  |     |");
                System.out.println("  |     O");
                break;
            case 4:
                System.out.println("  |-----*");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|\\");
                break;
            case 5:
                System.out.println("  |-----*");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|\\");
                System.out.println("  |    /");
                break;
            case 6:
                System.out.println("  |-----*");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|\\");
                System.out.println("  |    / \\");
                break;
        }
    }
}
