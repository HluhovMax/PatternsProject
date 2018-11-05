package patterns.structural.adapter;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class Ukrainian extends Speaker {
    public Ukrainian() {
        nativeWord = "Привіт!";
    }
    @Override
    String speak() {
        return nativeWord;
    }
}
