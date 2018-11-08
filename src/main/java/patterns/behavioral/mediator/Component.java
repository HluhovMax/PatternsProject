package patterns.behavioral.mediator;

/**
 * Created by Max Hluhov on 08.11.2018.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
