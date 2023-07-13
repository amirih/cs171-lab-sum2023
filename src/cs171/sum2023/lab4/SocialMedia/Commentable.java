package cs171.sum2023.lab4.SocialMedia;
public interface Commentable {
    // Method to add a comment
    void addComment(String comment);

    // Method to edit a comment
    void editComment(String oldComment, String newComment);

    // Method to delete a comment
    void deleteComment(String comment);
}
