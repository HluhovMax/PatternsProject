package patterns.structural.adapter;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class Translator extends Chinese implements English {
    String hello = "Hello!";
    Chinese chinese;
    Espanian espanian;
    Ukrainian ukrainian;

    public Translator() {
        chinese = new Chinese();
        espanian = new Espanian();
        ukrainian = new Ukrainian();
    }

    @Override
    public String speakEnglish(String abbreviation) {
        switch (abbreviation) {
            case "CHI":
                return hello + " translated from: " + chinese.nativeWord;
            case "ESP":
                return hello + " translated from: " + espanian.nativeWord;
            case "UKR":
                return hello + " translated from: " + ukrainian.nativeWord;
            default:
                try {
                    throw new Exception();
                } catch (Exception e) {
                    return "NoSuchNationException";
                }
        }
    }
}
