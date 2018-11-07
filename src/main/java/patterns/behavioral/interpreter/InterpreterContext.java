package patterns.behavioral.interpreter;

/**
 * Created by Max Hluhov on 07.11.2018.
 */
public class InterpreterContext {
    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }
}
