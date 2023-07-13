package cs171.sum2023.lab4.SocialMedia;
public class Main {
    public static void main(String[] args) {
        // Create a Facebook object
        Facebook facebook = new Facebook();

        // Use the Facebook object to post a status
        facebook.postStatus("Hello, world!");

        // Follow a user
        facebook.follow("john_doe");

        // Add a comment
        facebook.addComment("Great post!");

        // Edit the comment
        facebook.editComment("Great post!", "Fantastic post!");

        // Delete the comment
        facebook.deleteComment("Fantastic post!");

        // Unfollow the user
        facebook.unfollow("john_doe");
    }
}
