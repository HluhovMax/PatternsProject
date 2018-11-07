package patterns.behavioral.iterator;

/**
 * Created by Max Hluhov on 07.11.2018.
 */
public interface SocialNetwork {
    public ProfileIterator createFriendsIterator(String profileEmail);

    public ProfileIterator createCoworkersIterator(String profileEmail);
}
