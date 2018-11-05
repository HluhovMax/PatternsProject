package patterns.structural.adapter;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class Espanian extends Speaker {
    public Espanian() {
        nativeWord = "Hola!";
    }
    @Override
    String speak() {
        return nativeWord;
    }
}
