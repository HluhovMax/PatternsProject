package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Hluhov on 06.11.2018.
 */
public class BeltOfUpperExtremities {
    private List<Bone> bones = new ArrayList<>();

    public void addBone(Bone bone) {
        bones.add(bone);
    }

    public void removeBone(Bone bone) {
        bones.remove(bone);
    }

    public void upperExtremitiesDescription() {
        for (Bone bone : bones) {
            System.out.println("|======================================|");
            bone.description();
        }
    }
}
