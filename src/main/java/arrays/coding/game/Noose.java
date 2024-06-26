package arrays.coding.game;

public class Noose {

    // Graphics for each of the stages in an array of String
    private static final String[] STAGES = {
            " ------\\\n   |   |\n       |\n       |\n       |\n       |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n       |\n       |\n       |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n   |   |\n   |   |\n       |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n --+   |\n   |   |\n       |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n --+-- |\n   |   |\n       |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n --+-- |\n   |   |\n  /    |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n --+-- |\n   |   |\n  / \\  |\n       |\n========"
    };

    private int stage;

    public boolean isComplete() {
        return stage == STAGES.length - 1;
    }

    public void advance() {
        if (!isComplete()) {
            stage++;
        }
    }

    @Override
    public String toString() {
        return STAGES[stage];
    }
}
