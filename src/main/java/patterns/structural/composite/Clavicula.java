package patterns.structural.composite;

/**
 * Created by Max Hluhov on 06.11.2018.
 */
public class Clavicula implements Bone{
    @Override
    public void description() {
        System.out.println("Clavicula is a long S-shaped curved bone,\n" +
                " which is located between the clavicular margin of the\n" +
                " sacrum and the shoulder of the shoulder.\n" +
                " The clavicle has an elongated body shape\n" +
                " (coipus claviculae) and two ends: the enlarged thoracic end\n" +
                " (extremitas sternalis) and extended extremities\n" +
                " (extremitas acromialis), to which some of the trapezius\n" +
                " muscle fibers and the subclavian muscle are attached.\n" +
                " At the thoracic end of the collarbone there is a\n" +
                " saddle-shaped dentine-like articularis (facies articularis\n" +
                " sternalis) for connection to the sacrum.");
    }
}
