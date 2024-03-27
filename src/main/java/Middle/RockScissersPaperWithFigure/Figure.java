package Middle.RockScissersPaperWithFigure;

public interface Figure {
    int getType();

    boolean isWon(Figure opponent);
}
