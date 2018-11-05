package patterns.structural.adapter;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class SpeakUP {
    public static void main(String[] args) {
        English english = new Translator();
        System.out.println(english.speakEnglish("CHI"));
    }
}
