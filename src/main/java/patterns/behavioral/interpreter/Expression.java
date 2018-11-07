package patterns.behavioral.interpreter;

/**
 * Created by Max Hluhov on 07.11.2018.
 */
public interface Expression {
    String interpret(InterpreterContext ic);
}
