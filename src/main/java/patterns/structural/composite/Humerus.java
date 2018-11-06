package patterns.structural.composite;

/**
 * Created by Max Hluhov on 06.11.2018.
 */
public class Humerus implements Bone{
    @Override
    public void description() {
        System.out.println("The humerus has a body of\n" +
                " the humerus (corpus humeri) and two gyrus (the ends)\n" +
                " - thickened upper legs, proximal (epiphysis proximalis)\n" +
                " and enlarged lower limbs, distal (epiphysis distalis).\n" +
                " On the upper build is a round head of the humerus\n" +
                " (caput humeri), which is delimited by a furrow - anatomical\n" +
                " neck (collum anatomicum).");
    }
}
