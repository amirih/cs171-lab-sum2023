package cs171.sum2023.lab4.SocialMedia;
public abstract class SocialMedia {
    // Method to post a status
    public abstract void postStatus(String status);

    // Method to follow a user
    public abstract void follow(String username);

    // Method to unfollow a user
    public abstract void unfollow(String username);
}
