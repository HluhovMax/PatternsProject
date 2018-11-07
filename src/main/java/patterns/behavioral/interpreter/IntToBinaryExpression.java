package patterns.behavioral.interpreter;

/**
 * Created by Max Hluhov on 07.11.2018.
 */
public class IntToBinaryExpression implements Expression{
    private int i;

    public IntToBinaryExpression(int c){
        this.i=c;
    }
    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}
