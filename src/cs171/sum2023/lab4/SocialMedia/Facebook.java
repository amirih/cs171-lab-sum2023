package cs171.sum2023.lab4.SocialMedia;
public class Facebook extends SocialMedia implements Commentable {
    // Implementing the postStatus method
    public void postStatus(String status) {
        // Logic to post a status on Facebook
        System.out.println("Posted a status on Facebook: " + status);
    }

    // Implementing the follow method
    public void follow(String username) {
        // Logic to follow a user on Facebook
        System.out.println("Followed a user on Facebook: " + username);
    }

    // Implementing the unfollow method
    public void unfollow(String username) {
        // Logic to unfollow a user on Facebook
        System.out.println("Unfollowed a user on Facebook: " + username);
    }

    // Implementing the addComment method
    public void addComment(String comment) {
        // Logic to add a comment on Facebook
        System.out.println("Added a comment on Facebook: " + comment);
    }

    // Implementing the editComment method
    public void editComment(String oldComment, String newComment) {
        // Logic to edit a comment on Facebook
        System.out.println("Edited a comment on Facebook: " + oldComment + " to " + newComment);
    }

    // Implementing the deleteComment method
    public void deleteComment(String comment) {
        // Logic to delete a comment on Facebook
        System.out.println("Deleted a comment on Facebook: " + comment);
    }
}
