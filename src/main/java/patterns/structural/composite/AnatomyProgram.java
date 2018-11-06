package patterns.structural.composite;

/**
 * Created by Max Hluhov on 06.11.2018.
 */
public class AnatomyProgram {
    public static void main(String[] args) {
        BeltOfUpperExtremities beltOfUpperExtremities =
                new BeltOfUpperExtremities();
        Bone bone = new Clavicula();
        Bone bone1 = new Humerus();
        Bone bone2 = new Scapula();

        beltOfUpperExtremities.addBone(bone);
        beltOfUpperExtremities.addBone(bone1);
        beltOfUpperExtremities.addBone(bone2);

        beltOfUpperExtremities.upperExtremitiesDescription();
    }
}
