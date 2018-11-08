package patterns.behavioral.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Max Hluhov on 08.11.2018.
 */
public class SaveButton extends JButton  implements Component {
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}
