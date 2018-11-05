package patterns.structural.adapter;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class Chinese extends Speaker {
    public Chinese() {
        nativeWord = "niHao!";
    }
    @Override
    String speak() {
        return nativeWord;
    }
}
