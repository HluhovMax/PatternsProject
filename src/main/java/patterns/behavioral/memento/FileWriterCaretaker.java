package patterns.behavioral.memento;

/**
 * Created by Max Hluhov on 08.11.2018.
 */
public class FileWriterCaretaker {
    private Object obj;

    public void save(FileWriterUtil fileWriter){
        this.obj=fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter){
        fileWriter.undoToLastSave(obj);
    }
}
