package patterns.structural.composite;

/**
 * Created by Max Hluhov on 06.11.2018.
 */
public class Scapula implements Bone{
    @Override
    public void description() {
        System.out.println("Scapula (scapula) is a flat bony of\n" +
                " a triangular shape adjacent to the chest at the\n" +
                " level II-VII ribs. The blade has three angles:\n" +
                " angulus inferior, angulus lateralis and angulus superior,\n" +
                " as well as three edges: margo medialis, vertebrae,\n" +
                " lateral margin (margo lateralis),\n" +
                " directed to the side and to the bottom,\n" +
                " and to the upper edge (margo superior),\n" +
                " which has a scapular scapula (incisura scapulae)\n" +
                " for the passage of the peritoneal vessels and the nerve " );
    }
}
