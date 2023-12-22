package onlinequiz.qa;

public class MarkManager implements IMarkManager {

    private int total = 0;
    private int correctNumber = 0;

    @Override
    public void correct() {
        total++;
        correctNumber++;
    }

    @Override
    public void incorrect() {
        total++;
    }

    @Override
    public float getMarks() {
        return (float) (correctNumber / total) * 100;
    }
}
