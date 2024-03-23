package datatypes.coding.packageStudy.engine;

public class RandomNumberGenerator {

    public int getNumberToGuess(){
        return (int) ((Math.random() * 10) + 1);
    }
}
